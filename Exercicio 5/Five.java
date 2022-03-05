import java.util.Random;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10)+1;
        int y;

        do {
            System.out.println("Entre com um valor:");
            y = entrada.nextInt();
        }
        while(!(y == x));

        System.out.println(y);

    }
}
