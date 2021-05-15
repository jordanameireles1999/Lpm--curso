
public class CursoVirtual extends Curso {
	
    public CursoVirtual(int id, String nomeBase, double valorBase, int totalAulas, int atividadesAvaliativas) {
		super(id, nomeBase, valorBase, totalAulas, atividadesAvaliativas);
	}

	private static final double ACRESCIMO = 0.4;


    @Override
   public double calculaValorCurso() {
        return (super.valorBase*ACRESCIMO) + super.valorBase;
    }

	@Override
	public String compoeNome() {
		return "Curso Virtual de " + super.nomeBase;
	}
}
