public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulei");
    }
    void soltarTurbo(){
        System.out.println("Soltando turbo");

    }
    void fazerDrift(){
        System.out.println("AHOWW, olha o drift!");

    }
}
