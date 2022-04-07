public class Principal2 {
    public static void main(String[] args) {
        Motor motor1 = new Motor(135, "Pudim");
        Motor motor2 = new Motor(145, "Meow");
        Carro carro1 = new Carro("Azul","Pipipo", "Renault",100,1000, motor1);
        Carro carro2 = new Carro("Vermelho", "Meow", "Renault",200, 1000, motor2);

        carro1.ligar();
        carro1.acelerar();
        carro1.mostraInfo();

        carro2.ligar();
        carro2.acelerar();
        carro2.mostraInfo();

    }
}
