package inatel.cdg.br;
import inatel.cdg.br.inimigo.Asteroide;
import inatel.cdg.br.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("Nomeeee", 90, "Explosivo");
        Nave nave1 = new Nave("Joyce", 300,"Normal");

        Asteroide asteroide = new Asteroide("Lua", "Grande");
        Asteroide asteroide1 = new Asteroide("Marte", "Pequeno");

        nave.atirar(asteroide);
        nave.atirar(asteroide1);

        nave1.atirar(asteroide);
        nave1.atirar(asteroide1);


    }
}

