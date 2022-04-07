import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);

        int firstplay;
        int secondplay;
        int thirdplay;
        int media;//para receber o resultado da média
        int result; //para receber o resultado da soma

        firstplay =  sc1.nextInt();
        secondplay = sc1.nextInt();
        thirdplay = sc1.nextInt();

        result = firstplay + secondplay + thirdplay;

        System.out.println(result);

        media = (result)/3;

        System.out.println(media);



    }
}
