import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) throws IOException {
		Empresa empresa = new Empresa();

		ArrayList listaStringCursos = readFile("Curso/files/curso.txt");
		ArrayList listaStringAlunos = readFile("Curso/files/aluno.txt");

		ArrayList<Curso> listaCursos = new ArrayList<Curso>();

		for (Object stringCurso: listaStringCursos) {
			String[] stringCursoArray =  stringCurso.toString().split(";");
			String tipo = stringCursoArray[2];
			switch (tipo){
				case "0":
					empresa.add(new CursoLeitura(Integer.parseInt(stringCursoArray[0]), stringCursoArray[1], Double.parseDouble(stringCursoArray[3]), Integer.parseInt(stringCursoArray[4]), Integer.parseInt(stringCursoArray[5])));
					break;
				case "1":
					empresa.add(new CursoVirtual(Integer.parseInt(stringCursoArray[0]), stringCursoArray[1], Double.parseDouble(stringCursoArray[3]), Integer.parseInt(stringCursoArray[4]), Integer.parseInt(stringCursoArray[5])));
					break;
				case "2":
					empresa.add(new CursoGuiado(Integer.parseInt(stringCursoArray[0]), stringCursoArray[1], Double.parseDouble(stringCursoArray[3]), Integer.parseInt(stringCursoArray[4]), Integer.parseInt(stringCursoArray[5])));
					break;
				default:
					new CursoLeitura(Integer.parseInt(stringCursoArray[0]), stringCursoArray[1], Double.parseDouble(stringCursoArray[3]), Integer.parseInt(stringCursoArray[4]), Integer.parseInt(stringCursoArray[5]));
			}
		}
		for(int i = 0; i < listaStringAlunos.size(); i++) {
			String[] stringAlunoArray =  listaStringAlunos.get(i).toString().split(";");
			if(i % 2 == 0) {
				empresa.add(new Aluno(Integer.parseInt(stringAlunoArray[0]), stringAlunoArray[1]));

				String[] stringCursoAlunoArray =  listaStringAlunos.get(i+1).toString().split(";");
				for (String stringIdCurso: stringCursoAlunoArray ) {
					empresa.matricular(empresa.getAlunoById(Integer.parseInt(stringAlunoArray[0])), empresa.getCursoById(Integer.parseInt(stringIdCurso)));
				}
			}
		}

		imprimeExtrato(empresa);
		imprimeTotalAReceber(empresa);

	}

	private static void imprimeTotalAReceber(Empresa empresa) {
		System.out.println("Empresa deve receber:\t\t" + empresa.totalAReceber());
	}

	private static void imprimeExtrato(Empresa empresa) {
		for (Aluno aluno : empresa.getListaAlunos()) {
			System.out.println("Extrato para aluno: " + aluno.getNome());
			List<Curso> cursos = aluno.getListaCursos();
			double[] valores = aluno.valorPorCurso();
			System.out.println("Curso\t\t\t\tValor por Curso");

			for (int i = 0; i < cursos.size(); i++) {
				System.out.println(cursos.get(i).compoeNome() + "\t" + valores[i]);
			}
			System.out.println("Total\t\t\t\t" + aluno.calculaValorFinal());
			System.out.println();

		}
	}

	private static ArrayList readFile(String filePath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		ArrayList array = new ArrayList<>();
		String line;

		while ((line = reader.readLine()) != null) {
			array.add(line);
		}
		reader.close();
		return array;
	}
}


