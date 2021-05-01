import java.util.List;

public class App {
	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		Aluno aluno1 = new Aluno("Geovanna");
		Aluno aluno2 = new Aluno("Tácio");
		Aluno aluno3 = new Aluno("Kléber");
		Aluno aluno4 = new Aluno("Marco Aurélio");
		Aluno aluno5 = new Aluno("Júlia");

		Curso curso1 = new CursoLeitura("História", 210.00, 50, 12);
		Curso curso2 = new CursoGuiado("História", 210.00, 50, 12);
		Curso curso3 = new CursoVirtual("História", 210.00, 50, 12);
		Curso curso4 = new CursoLeitura("Matemática", 180.00, 60, 10);
		Curso curso5 = new CursoGuiado("Matemática", 180.00, 60, 10);
		Curso curso6 = new CursoVirtual("Matemática", 180.00, 60, 10);
		Curso curso7 = new CursoLeitura("Culinária", 150.00, 100, 20);
		Curso curso8 = new CursoGuiado("Culinária", 150.00, 100, 20);
		Curso curso9 = new CursoVirtual("Culinária", 150.00, 100, 20);
		Curso curso10 = new CursoLeitura("WebDesign", 180.00, 80, 15);
		Curso curso11 = new CursoGuiado("WebDesign", 180.00, 80, 15);
		Curso curso12 = new CursoVirtual("WebDesign", 180.00, 80, 15);
		Curso curso13 = new CursoLeitura("Mecânica", 250.00, 40, 10);
		Curso curso14 = new CursoGuiado("Mecânica", 250.00, 40, 10);
		Curso curso15 = new CursoVirtual("Mecânica", 250.00, 40, 10);
		Curso curso16 = new CursoLeitura("Sociologia", 130.00, 30, 20);
		Curso curso17 = new CursoGuiado("Sociologia", 130.00, 30, 20);
		Curso curso18 = new CursoVirtual("Sociologia", 130.00, 30, 20);

		empresa.add(curso1);
		empresa.add(curso2);
		empresa.add(curso3);
		empresa.add(curso4);
		empresa.add(curso5);
		empresa.add(curso6);
		empresa.add(curso7);
		empresa.add(curso8);
		empresa.add(curso9);
		empresa.add(curso10);
		empresa.add(curso11);
		empresa.add(curso12);
		empresa.add(curso13);
		empresa.add(curso14);
		empresa.add(curso15);
		empresa.add(curso16);
		empresa.add(curso17);
		empresa.add(curso18);

		empresa.add(aluno1);
		empresa.add(aluno2);
		empresa.add(aluno3);
		empresa.add(aluno4);
		empresa.add(aluno5);

		empresa.matricular(aluno1, curso12);
		empresa.matricular(aluno1, curso9);
		empresa.matricular(aluno1, curso4);
		empresa.matricular(aluno1, curso13);
		empresa.matricular(aluno1, curso1);
		empresa.matricular(aluno1, curso17);
		empresa.matricular(aluno2, curso18);
		empresa.matricular(aluno2, curso12);
		empresa.matricular(aluno2, curso3);

		imprimeExtrato(empresa);
		imprimeTotalAReceber(empresa);

	}

	private static void imprimeTotalAReceber(Empresa empresa) {
		System.out.println("Total Geral\t\t\t" + empresa.totalAReceber());
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
}
