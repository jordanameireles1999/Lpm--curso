import java.util.List;

public class Matricula {
    public Aluno aluno;
    public Curso curso;
    public int aulasAssistidas;
    public boolean atividadesFeitas;
    public boolean matriculaAtiva;

    public Matricula(Aluno aluno, Curso curso){
        this.aluno = aluno;
        this.curso = curso;
        aluno.listaCursos.add(curso);

    }

    public void setAulasAssistidas(int aulasAssistidas) {
        this.aulasAssistidas = aulasAssistidas;
    }
    public void setAtividadesFeitas(boolean atividadesFeitas) {
        this.atividadesFeitas = atividadesFeitas;
    }
}
