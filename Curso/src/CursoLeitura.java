
public class CursoLeitura extends Curso {

    
    public CursoLeitura(String nomeBase, double valorBase, int totalAulas, int atividadesAvaliativas) {
		super(nomeBase, valorBase, totalAulas, atividadesAvaliativas);
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
