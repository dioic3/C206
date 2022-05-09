package dioice.inatel.br.mamifero;

public class Boi extends Mamifero {
    public Boi(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Eu sou uma vaca fofinha!");
    }
}
