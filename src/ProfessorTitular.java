public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(){}
    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, String especialidadeDoProfessor) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidadeDoProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
