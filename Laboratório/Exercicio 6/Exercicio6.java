import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10)+1;
        int y;
        System.out.println("Entre com um valor:");
        y = entrada.nextInt();

        if (y > x){
            System.out.println("Número gerado pelo x é maior");
        }
        else if (y < x){
            System.out.println("Número gerado pelo é menor");
        }

    }
}
