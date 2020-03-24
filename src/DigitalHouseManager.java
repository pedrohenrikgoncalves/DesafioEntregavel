
import java.util.ArrayList;

public class DigitalHouseManager {


    {
        String listaDeAlunos;
        String listaDeProfessores;
        String listaDeCursos;
        String listaDeMatriculas;

    }

    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    private ArrayList<Professor> listaDeProfessores = new ArrayList<>();
    private ArrayList<Curso> listaDeCursos = new ArrayList<>();
    private ArrayList<Matricular> listaDeMatriculas = new ArrayList<>();

    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public ArrayList<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(ArrayList<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public ArrayList<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(ArrayList<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public ArrayList<Matricular> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(ArrayList<Matricular> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }

    public void registrarCurso(String nome, Integer codigoDeCurso, Integer quantidadeMaximaDeAlunos) {
        Curso novoCurso = new Curso();
        novoCurso.setNome(nome);
        novoCurso.setCodigoDeCurso(codigoDeCurso);
        novoCurso.setQuantidadeMaximaDeAlunos(quantidadeMaximaDeAlunos);
        this.listaDeCursos.add(novoCurso);
    }

    public void excluirCurso(Integer paraExcluir) {
        for (Curso indexCurso : this.listaDeCursos) {
            Integer codigoIndexCurso = indexCurso.getCodigoDeCurso();
            if (codigoIndexCurso == paraExcluir) {
                this.listaDeCursos.remove(indexCurso);
                break;
            }
        }
    }


    public void adicionarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto) {
        Integer CursoAchado = 0;
        Professor TitularAchado = null;
        Professor AdjuntoAchado = null;
    }


    public void excluirProfessor(int codigoParaExcluir) {
        for (Professor indexProfessores : this.listaDeProfessores) {
            int codigoindexprofessoress = indexProfessores.getCodigoProfessor();
            if (codigoindexprofessoress == codigoParaExcluir) {
                this.listaDeProfessores.remove(indexProfessores);
                break;
            }
        }
    }

    public void matriculaDoAluno(String nome, String sobrenome, Integer codigoAluno) {
        this.listaDeAlunos.add(new Aluno(nome, sobrenome, codigoAluno));
    }

    public void matricularAluno(int codigoAluno, int codigoCurso) {

        int CursoJaCadastrado = 0;
        Aluno AlunoJaCadastrado = null;


        for (Curso indexCursoDaLista : this.listaDeCursos) {
            if (indexCursoDaLista.getCodigoDeCurso() == codigoCurso) {
                CursoJaCadastrado = this.listaDeCursos.indexOf(indexCursoDaLista);
                break;
            }
        }

        for (Aluno indexAlunoDaLista : this.listaDeAlunos) {
            if (indexAlunoDaLista.getCodigoDeAluno() == codigoAluno) {
                AlunoJaCadastrado = indexAlunoDaLista;
                break;
            }
        }

        if (this.listaDeCursos.get(CursoJaCadastrado).adicionarUmAluno(AlunoJaCadastrado)) {
            Curso CursoDesejado = listaDeCursos.get(CursoJaCadastrado);
            this.listaDeMatriculas.add(new Matricular(AlunoJaCadastrado, CursoDesejado));
            System.out.println("MAtricula Realizada !");
        } else {
            System.out.println("Todas vagas ja preenchidas ");
        }
    }

    {
    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade, Integer tempoDeCasa) {
        ProfessorTitular novoProfessorTitular = new ProfessorTitular();
        novoProfessorTitular.setNome(nome);
        novoProfessorTitular.setSobrenome(sobrenome);
        novoProfessorTitular.setTempoDeCasa(tempoDeCasa);
        novoProfessorTitular.setCodigoProfessor(codigoProfessor);
        novoProfessorTitular.setEspecialidade(especialidade);
        this.listaDeProfessores.add(novoProfessorTitular);
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor, int quantidadeDeHorasMonitoria, Integer tempoDeCasa) {
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto();
        novoProfessorAdjunto.setNome(nome);
        novoProfessorAdjunto.setSobrenome(sobrenome);
        novoProfessorAdjunto.setTempoDeCasa(tempoDeCasa);
        novoProfessorAdjunto.setCodigoProfessor(codigoProfessor);
        novoProfessorAdjunto.setquantidadeDeHorasMonitoria(quantidadeDeHorasMonitoria);
        this.listaDeProfessores.add(novoProfessorAdjunto);
    }
}
