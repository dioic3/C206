package dioice.inatel.br.mamifero;

public abstract class Mamifero implements Comparable<Mamifero> {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }
    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public int compareTo(Mamifero o) {
        if(this.vida < o.getVida()){
            return -1;
        }
        if(this.vida > o.getVida()){
            return 1;
        }
        return 0;
    }

}
