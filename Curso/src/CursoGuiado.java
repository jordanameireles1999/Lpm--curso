
public class CursoGuiado extends CursoVirtual {
	
	public CursoGuiado(String nomeBase, double valorBase, int totalAulas, int atividadesAvaliativas) {
		super(nomeBase, valorBase, totalAulas, atividadesAvaliativas);
	}

	private static final double ACRESCIMO = 0.2;



	@Override
	public double calculaValorCurso() {
		return (super.calculaValorCurso() * ACRESCIMO) + super.calculaValorCurso();
	}
	
	@Override
	public String compoeNome() {
		return "Curso Guiado de " + nomeBase;
	}
}
