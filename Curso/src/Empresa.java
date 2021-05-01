import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Curso> listaCursos = new ArrayList<Curso>();
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private List<Matricula> listaMatriculas = new ArrayList<Matricula>();

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void add(Aluno a) {
		listaAlunos.add(a);
	}

	public void add(Curso c) {
		listaCursos.add(c);
	}

	public List<Matricula> getListaMatriculas() {
		return listaMatriculas;
	}

	public void matricular(Aluno aluno, Curso curso) {
		Matricula matricula = new Matricula(aluno, curso);
		listaMatriculas.add(matricula);
	}

	public double totalAReceber() {

		double valorTotal = 0;

		for (Aluno aluno : listaAlunos) {
			valorTotal += aluno.calculaValorFinal();
		}
		return valorTotal;
	}

}
