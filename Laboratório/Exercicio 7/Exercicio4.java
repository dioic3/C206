import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a;
        double b;
        double resultado;
        String opção;

        opção = entrada.next();
        a = entrada.nextInt();
        b = entrada.nextInt();
        switch (opção) {
            case "soma":
                resultado = a + b;
                System.out.println("Soma: " + resultado);
                break;
            case "subtração":
                resultado = a - b;
                System.out.println("Subtração: " + resultado);
                break;
            case "multiplicação":
                resultado = a * b;
                System.out.println("Multiplicação: " + resultado);
                break;
            case "exponencial":
                resultado = Math.pow(a, b);
                System.out.println("Exponencial: " + resultado);
        }

    }
}
