import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        String tabela;
        int ou;
        int and;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Imprima a tabela da verdade que deseja: OR ou AND");
        tabela = entrada.next();

        switch (tabela) {
            case "or":
                System.out.println(" 0 + 0 = 0");
                System.out.println(" O + 1 = 1");
                System.out.println(" 1 + 0 = 1");
                System.out.println(" 1 + 1 = 1");
                break;
            case "and":
                System.out.println(" 0 x 0 = 0");
                System.out.println(" O x 1 = 0");
                System.out.println(" 1 x 0 = 0");
                System.out.println(" 1 x 1 = 1");
                break;
        }
    }

}
