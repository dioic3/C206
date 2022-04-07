import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salary_gerente;
        double salary_engenheiro;
        double serviços_terceirizados;
        double resultado;
        String type_salary;
        System.out.println("Escolha Gerente, Engenheiro ou Serviços Terceirizados.");
        type_salary = entrada.next();
        System.out.println("Entre com a quantidade salarios do gerente:");
        salary_gerente = entrada.nextInt();
        System.out.println("Entre com a quantidade de salario do Engenheiro:");
        salary_engenheiro = entrada.nextInt();
        System.out.println("Entre com a quantidade de horas do Serviços Terceirizados:");
        serviços_terceirizados = entrada.nextInt();

        switch (type_salary){
            case "Gerente":
                resultado = salary_gerente * 998;
                System.out.println(resultado);
                break;
            case "Engenheiro":
                resultado = salary_engenheiro * 998;
                System.out.println(resultado);
                break;
            case "Serviços":
                resultado = serviços_terceirizados * 9.30 * 20;
                System.out.println(resultado);
                break;
        }
    }
}
