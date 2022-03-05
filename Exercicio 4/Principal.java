import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade;

        quantidade = entrada.nextInt();

        switch (quantidade){
            case 10:
            case 20:
                System.out.println("A aula será ministrada na sala I-15");
                break;
            case 30:
                System.out.println("A aula será ministrada na sala I-22");
                break;
            default:
                System.out.println("Não terá aula.");
        }



    }
}
