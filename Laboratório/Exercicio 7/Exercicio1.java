import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double price;
        double result;
        Scanner entrada = new Scanner(System.in);

        price = entrada.nextInt();
        result = price/(2.75);
        System.out.println(result);
    }
}
