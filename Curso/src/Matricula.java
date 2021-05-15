
public class Matricula implements ICertificavel {
    public Aluno aluno;
    public Curso curso;
    public int aulasAssistidas;
    public int atividadesFeitas;
    public boolean matriculaAtiva;

    public Matricula(Aluno aluno, Curso curso){
        this.aluno = aluno;
        this.curso = curso;
        this.aluno.listaCursos.add(curso);
        curso.listaAlunos.add(aluno);

    }

    public void setAulasAssistidas(int aulasAssistidas) {
        this.aulasAssistidas = aulasAssistidas;
    }
    public void setAtividadesFeitas(int atividadesFeitas) {
        this.atividadesFeitas = atividadesFeitas;
    }
    
	@Override
	public boolean temDireitoCertificado() {
		boolean certificado = false;

		if (curso.getTotalAulas() == aulasAssistidas && curso.getAtividadesAvaliativas() == atividadesFeitas) {
			certificado = true;
		}
		return certificado;
	}
}
