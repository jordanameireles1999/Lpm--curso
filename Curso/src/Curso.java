import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
	public List<Aluno> listaAlunos = new ArrayList<Aluno>();
	protected String nomeBase;
	protected double valorBase;
	protected int totalAulas;
	protected int atividadesAvaliativas;


	public Curso(String nomeBase, double valorBase, int totalAulas, int atividadesAvaliativas) {
		this.nomeBase = nomeBase;
		this.valorBase = valorBase;
		this.totalAulas = totalAulas;
		this.atividadesAvaliativas = atividadesAvaliativas;

	}

	public abstract String compoeNome();

	public abstract double calculaValorCurso();

	public int getTotalAulas() {
		return totalAulas;
	}

	protected void setTotalAulas(int numAulas) {
		this.totalAulas = numAulas;
	}
	
	public int getAtividadesAvaliativas() {
		return atividadesAvaliativas;
	}

	public void setAtividadesAvaliativas(int atividadesAvaliativas) {
		this.atividadesAvaliativas = atividadesAvaliativas;
	}
}
