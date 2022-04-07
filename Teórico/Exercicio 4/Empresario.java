public class Empresario {
    private String nome;
    private long cpnj;

    //uma banda pode ter ou não um empresário
    Empresario(String nome, long cpnj){
        this.nome = nome;
        this.cpnj = cpnj;
        System.out.println("Criando empresário");
    }
}
