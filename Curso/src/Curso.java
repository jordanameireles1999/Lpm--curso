public abstract class Curso {
     protected String nome;
     protected double valorCurso;
     protected double valorBase;
     protected int totalAulas;


    public Curso(String nome, double valorBase){
        this.nome = nome;
        this.valorBase = valorBase;
    }
    public int getTotalAulas() {
        return totalAulas;
    }
    protected  void setTotalAulas(int numAulas){
         this.totalAulas = numAulas;
     }
    protected abstract void valorInicialCurso();
}
