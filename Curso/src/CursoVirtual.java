
public class CursoVirtual extends Curso {
	
    public CursoVirtual(String nomeBase, double valorBase, int totalAulas, int atividadesAvaliativas) {
		super(nomeBase, valorBase, totalAulas, atividadesAvaliativas);
	}

	private static final double ACRESCIMO = 0.4;


    @Override
   public double calculaValorCurso() {
        return (valorBase*ACRESCIMO) + valorBase;
    }

	@Override
	public String compoeNome() {
		return "Curso Virtual de " + nomeBase;
	}
}
