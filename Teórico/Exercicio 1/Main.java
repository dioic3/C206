public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        //atribuindo nome para o kart
        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        //atribuindo velocidade para os dois karts
        kart1.motor.velocidadeMax = 120;
        kart2.motor.velocidadeMax = 130;
        //inserindo cilindradas para os dois karts
        kart1.motor.cilindradas = 120.02f;//coloca f para dizer que é um float
        kart1.motor.cilindradas = 140;
        //exibindo informaçoes para os dois karts
        kart1.motor.mostrarInfo();
        System.out.println("");
        kart2.motor.mostrarInfo();




    }
}
