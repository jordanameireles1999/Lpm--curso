import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public int id;
	private String nome;
	protected List<Curso> listaCursos;

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	private static final double DESCONTO = 0.15;

	public Aluno(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
		listaCursos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public double calculaValorFinal() {
		double valorFinal = 0;
		for (double valor : valorPorCurso()) {
			valorFinal += valor;
		}

		return valorFinal;
	}

	public double[] valorPorCurso() {
		int tam = listaCursos.size();

		double[] valorCurso = new double[tam];

		if (tam < 3) {
			for (int i = 0; i < tam; i++) {
				valorCurso[i] = this.listaCursos.get(i).calculaValorCurso();
				// System.out.println(listaCursos.get(i).getNome() + valorCurso[i]);
			}
		} else {
			for (int i = 0; i < tam; i++) {
				if ((i+1) % 6 == 0) {
					valorCurso[i] = 0.0;
				} else {
					valorCurso[i] = this.listaCursos.get(i).calculaValorCurso()
							- (this.listaCursos.get(i).calculaValorCurso() * DESCONTO);
				}
				// System.out.println(listaCursos.get(i).getNome() + valorCurso[i]);
			}
		}
		return valorCurso;
	}

}
