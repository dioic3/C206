import java.util.Scanner;

public class Hatch extends Carro{
    int portas;

    public Hatch(double valor, String cor, int ano, int portas){
        super(valor,cor,ano);
        this.portas = portas;
    }

    @Override
    public void cadastrar(){
        super.cadastrar();
        System.out.println("Quantas portas tem?");
        Scanner entrada = new Scanner(System.in);
        this.portas = entrada.nextInt();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ano: " + getAno());
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
