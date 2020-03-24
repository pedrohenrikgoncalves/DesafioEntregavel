import java.util.ArrayList;

public class Curso {
    public static void main(String[] args){}

    private static Object Aluno;
    private String nome;
    private int codigoDeCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaDeAlunos;
    private ArrayList<Aluno> alunosDoCurso;

    public Curso() {}

    public Curso(String nome, Integer codigoDeCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer quantidadeMaximaDeAlunos, ArrayList<Aluno> alunosDoCurso) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        this.alunosDoCurso = alunosDoCurso;
    }

    public static Object getAluno() {
        return Aluno;
    }

    public static void setAluno(Object aluno) {
        Aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public ArrayList<Aluno> getAlunosDoCurso() {
        return alunosDoCurso;
    }

    public void setAlunosDoCurso(ArrayList<Aluno> alunosDoCurso) {
        this.alunosDoCurso = alunosDoCurso;
    }

    public boolean verificarCurso(Integer codigoCurso) {
        Integer codigoDeCurso = this.getCodigoDeCurso();
        if (codigoDeCurso.equals(codigoCurso)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarUmAluno(Aluno novoAluno) {
        int quantidadeAlunoNoCurso = this.alunosDoCurso.size();
        int quantidadeMaximaNoCurso = this.getQuantidadeMaximaDeAlunos();
        if (quantidadeAlunoNoCurso >= quantidadeMaximaNoCurso) {
            return false;
        }else{
            this.alunosDoCurso.add(novoAluno);
            return true;
            }
        }
        public void excluirAluno(Aluno alunoDescadastrado){
            for(Aluno index: this.alunosDoCurso){
                if(index == alunoDescadastrado){
                    this.alunosDoCurso.remove(alunoDescadastrado);
                    break;
                }
            }
        }
    }


