import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    public List<Curso> listaCursos;
    private static final double DESCONTO = 0.15;
    private double valorBruto;
    private double valorFinal;



    public Aluno(String nome) {
        this.nome = nome;
        listaCursos = new ArrayList<>();

    }
    public double getValorFinal() {
        return valorFinal;
    }

    public void valorTotalBruto(){
        for(Curso curso : listaCursos ){
            valorBruto= valorBruto+ curso.getValorCurso();
        }
    }
    public void valorTotalDescTresCursos(){
        if(listaCursos.size()>=3) {
            valorFinal = (valorBruto * DESCONTO)+ valorBruto;
        }
    }

    public void valorDescACadaSeis(){
        int tam = listaCursos.size();
        if(tam>5){
            for(int i =1 ;i<=tam; i++){
                if(i%6==0) {
                    double valorCurso = listaCursos.get(i).valorCurso;
                    valorFinal = valorFinal - valorCurso;
                }
            }
        }
    }
  



}
