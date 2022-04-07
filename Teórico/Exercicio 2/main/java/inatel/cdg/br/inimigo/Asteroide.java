package inatel.cdg.br.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }
    public void destruir(){
        System.out.println("Bumm! " + this.nome);
    }
}
