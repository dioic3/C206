public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];
        Curso curso = new Curso();
        Disciplina[] disciplina = new Disciplina[3];

        Aluno aluno = new Aluno();
        aluno.matricula = 134;
        aluno.idade = 15;
        aluno.nome = "Joyce";
        alunos[0] = aluno;

        Aluno aluno1 = new Aluno();
        aluno1.matricula = 345;
        aluno1.nome = "Vinicius";
        aluno1.idade = 30;
        alunos[1] = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.matricula = 987;
        aluno2.nome = "Matheus";
        aluno2.idade = 20;
        alunos[2] = aluno2;

        Disciplina disciplina1 = new Disciplina("Luiz", "Matemática", "M0003");
        disciplina[0] = disciplina1;

        Disciplina disciplina2 = new Disciplina("Egidio", "Calculo 1", "M001");
        disciplina[1] = disciplina2;

        Disciplina disciplina3 = new Disciplina("Matheus", "Analogica 3", "E206");
        disciplina[2] = disciplina3;

        curso.nome = "Computação";
        curso.tipo = "GEC";
        curso.turno = "Noturno";

        curso.mostrarInfo();





    }
}

