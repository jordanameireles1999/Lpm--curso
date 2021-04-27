public  class CursoLeitura extends Curso{

    public CursoLeitura(double valorBase){
        super("Curso Leitura", valorBase);
    }

    @Override
    protected void valorInicialCurso() {
        valorCurso = valorBase;
    }
}
