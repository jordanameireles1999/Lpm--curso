public class CursoVirtual extends Curso{
    private static final double ACRESCIMO = 0.4;

    public CursoVirtual(double valorBase){
        super("Curso Virtual", valorBase);
    }

    @Override
    protected void valorInicialCurso() {
        valorCurso = (valorBase*0.4) + valorBase;
    }


}
