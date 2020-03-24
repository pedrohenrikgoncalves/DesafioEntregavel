public class ProfessorAdjunto extends Professor{

    private Integer quantidadeDeHorasMonitoria;

    public ProfessorAdjunto(){}
    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer quantidadeDeHorasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.quantidadeDeHorasMonitoria = quantidadeDeHorasMonitoria;
    }

    public Integer getQuantidadeDeHorasMonitorada() {
        return quantidadeDeHorasMonitoria;
    }

    public void setquantidadeDeHorasMonitoria(Integer quantidadeDeHorasMonitoria) {
        this.quantidadeDeHorasMonitoria = quantidadeDeHorasMonitoria;
    }
}
