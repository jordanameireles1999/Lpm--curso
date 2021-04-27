import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    public List<Curso> listaCursos;
    private static final double DESCONTO = 0.15;


    public Aluno(String nome) {
        this.nome = nome;
        listaCursos = new ArrayList<>();;
    }
}
