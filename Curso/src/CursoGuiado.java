public class CursoGuiado extends Curso{
    private static final double ACRESCIMO = 0.2;

    public CursoGuiado(double valorBase){
        super("Curso Guiado", valorBase);
    }

    @Override
    protected void valorInicialCurso() {
        CursoVirtual base = new CursoVirtual(valorBase);
        valorCurso =(base.valorCurso * ACRESCIMO) + base.valorCurso;
    }
}
