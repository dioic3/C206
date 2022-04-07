import java.util.Scanner;

public abstract class Carro implements Controle {
   protected double valor;
   protected String cor;
   protected int ano;

   Carro(double valor, String cor, int ano){
       this.valor = valor;
       this.cor = cor;
       this.ano = ano;
   }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void cadastrar() {
        System.out.println("Qual é o ano do meu carro?");
        Scanner entrada = new Scanner(System.in);
        this.ano = entrada.nextInt();
        System.out.println("Qual é a cor do seu carro?");
        this.cor = entrada.next();
        System.out.println("Qual é o valor?");
        this.valor = entrada.nextInt();
    }
}
