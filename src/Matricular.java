import java.util.Date;

public class Matricular {

    private String aluno;
    private String curso;
    private Date dataDaMatricula;

    public Matricular(Aluno alunoJaCadastrado, Curso cursoDesejado){}
    public Matricular(String aluno, String curso, Date dataDaMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDaMatricula = new Date();
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }
}
