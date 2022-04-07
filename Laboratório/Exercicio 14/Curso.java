public class Curso {
    Disciplina[] disciplina;
    Aluno[] aluno;
    String nome;
    String tipo;
    String turno;

   Curso(){
    }
    void mostrarInfo(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Tipo de curso: " + tipo);
        System.out.println("Turno: " + turno);

        System.out.println(" ");
        for (int i = 0; i < aluno.length; i++){

            System.out.println("Nome do aluno: " + aluno[i].nome);
            System.out.println("Número da matricula: " + aluno[i].matricula);
            System.out.println("Idade: " + aluno[i].idade);
        }
        System.out.println(" ");
        for (int i = 0; i < disciplina.length; i++){
            System.out.println("Nome do professor: " + disciplina[i].professor);
            System.out.println("Disciplina: " + disciplina[i].disciplina);
            System.out.println("Nome da disciplina: " + disciplina[i].nome_da_disciplina);
        }
    }

}
