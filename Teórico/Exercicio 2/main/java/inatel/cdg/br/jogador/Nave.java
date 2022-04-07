package inatel.cdg.br.jogador;
import inatel.cdg.br.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }


    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){

        if (tipoTiro == "Explosivo"){
            ast.destruir();
        }
        else{
            if (ast.getTipoAsteroide().equals("Grande")){
                System.out.println("Não destroi o Asteroide!");
            }
            else{
                ast.destruir();
            }
        }

    }

}
