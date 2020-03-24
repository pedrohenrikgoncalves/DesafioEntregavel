import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DigitalHouseManager chamada = new DigitalHouseManager();
        chamada.setListaDeAlunos(new ArrayList<Aluno>());
        chamada.setListaDeCursos(new ArrayList<Curso>());
        chamada.setListaDeProfessores(new ArrayList<Professor>());
        chamada.setListaDeMatriculas(new ArrayList<Matricular>());

        chamada.registrarCurso("FullStack",20001,3);
        chamada.registrarCurso("Android",20002,2);

        chamada.registrarProfessorTitular( "Armando", "Guerra",1,"Balística", 0);
        chamada.registrarProfessorTitular("Tommy","Leite",1,"Pecuária", 0);
        chamada.registrarProfessorAdjunto("Judiscreide","Jeca",0, 3,5);
        chamada.registrarProfessorAdjunto("Claudinho","Bochecha",4,0,0);
        chamada.adicionarProfessores(20001,2,3);
        chamada.adicionarProfessores(20002,1,4);



        chamada.matriculaDoAluno("Zacarias","Dias",1);
        chamada.matriculaDoAluno("Gertrudes","Gonçalves",2);
        chamada.matriculaDoAluno("Epaminondas","Silva",3);
        chamada.matriculaDoAluno("Brunilda","Schweppes",4);
        chamada.matriculaDoAluno("Ananias","Grande",5);

        chamada.matricularAluno(1,20001);
        chamada.matricularAluno(2,20002);
        chamada.matricularAluno(3,20001);
        chamada.matricularAluno(4,20002);
        chamada.matricularAluno(5,20002);

    }
}