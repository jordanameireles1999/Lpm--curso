
public class CursoLeitura extends Curso {

    
    public CursoLeitura(int id, String nomeBase, double valorBase, int totalAulas, int atividadesAvaliativas) {
		super(id, nomeBase, valorBase, totalAulas, atividadesAvaliativas);
	}

	@Override
	public double calculaValorCurso() {
		return valorBase;
	}
    
	@Override
	public String compoeNome() {
		return "Curso Leitura de " + nomeBase;
	}

}
