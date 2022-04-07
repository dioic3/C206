import jdk.swing.interop.SwingInterOpUtils;

public class Membro {
    private String nome;
    private String função;

    public String getNome() {
        return nome;
    }

    public String getFunção() {
        return função;
    }

    //uma banda pode ter no minimo um ou muitos membros
    Membro(String nome, String função){
        this.nome = nome;
        this.função = função;
        System.out.println("Criando o membro");
    }
}
