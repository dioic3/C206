package dioice.inatel.br.mamifero;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Eu sou um cachorro fofinho!");
    }

}
