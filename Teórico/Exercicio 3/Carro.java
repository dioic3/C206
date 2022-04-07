public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    Carro(String cor, String marca, String modelo, double velocidadeAtual, double velocidadeMax, Motor motor){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMax = velocidadeMax;
        this.motor = motor;

    }
    void ligar(){
        System.out.println("Carro ligado!");
    }
    void acelerar(){
        if(velocidadeAtual+10 < velocidadeMax)
            velocidadeAtual = velocidadeAtual + 10;
        else
        {
            System.out.println("Velocidade máxima atingida");
        }
    }
    void mostraInfo(){
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual);
        System.out.println("Velocidade Máxima: " + velocidadeMax);
        System.out.println("Potencia: " + motor.potencia);
        System.out.println("Tipo: " + motor.tipo);
    }
}
