import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //notas
        int nota1;
        int nota2;
        int np3;
        int total;
        int result;

        System.out.println("First");
        nota1 = entrada.nextInt();
        System.out.println("Second");
        nota2 = entrada.nextInt();
        System.out.println("NP3");
        np3 = entrada.nextInt();
        result = (nota1 + nota2)/2;
        if(result >= 60){

            System.out.println("Aprovado! " + "Nota: "+ result);
        }
        else if (result < 60) {
            total = (np3 + result) / 2;
            System.out.println("Aprovado! " + "Nota: " + total);
        }

    }


}
