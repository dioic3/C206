public class Musica {
    private String nome;
    private double duracao;



    //uma banda pode ter uma ou muitas músicas
    Musica(String nome, double duracao){
        this.nome = nome;
        this.duracao = duracao;
    }  public String getNome() {
        return nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
