public  class CursoLeitura extends Curso{

    public CursoLeitura(double valorBase){
        super("Curso Leitura", valorBase);
    }

    @Override
    public void valorInicialCurso() {
        valorCurso = valorBase;
    }
}
