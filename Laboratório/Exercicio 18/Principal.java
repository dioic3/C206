import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int x;
        int y;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor de x:");
        x = scanner.nextInt();
        System.out.println("Entre com o valor de y:");
        y = scanner.nextInt();

        try{
            Calculadora calculadora = new Calculadora(x, y);
            calculadora.dividir(x, y);
            calculadora.multiplicar(x,y);
            calculadora.subtrair(x,y);
            calculadora.soma(x,y);

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}