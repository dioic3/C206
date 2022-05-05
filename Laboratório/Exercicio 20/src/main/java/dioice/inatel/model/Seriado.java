package dioice.inatel.model;

public class Seriado implements Comparable<Seriado>{
    private String nome;
    private String streaming;
    private int temporadas;
    private int anoCriacao;

    public Seriado(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public int compareTo(Seriado o) {
        return nome.compareTo(o.nome);
    }
}
