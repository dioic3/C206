import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        double np1;
        double np2;
        double result;
        Scanner entrada = new Scanner(System.in);

        np1 = entrada.nextInt();
        np2 = entrada.nextInt();
        result = (np1 + np2)/2;
        if (result >= 60){
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }
    }
}
