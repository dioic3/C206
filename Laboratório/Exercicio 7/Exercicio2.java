public class Exercicio2 {
    public static void main(String[] args) {
        double peso = 100;
        double altura = 1.80;
        double resultado;

        resultado = (peso / (altura * altura));
        System.out.println(resultado);

        if (resultado < 18.5){
            System.out.println("Abaixo do Peso.");
        }
        else if (resultado > 18.5 && resultado < 24.9){
            System.out.println("Peso Normal.");
        }
        else if (resultado > 25 && resultado < 29.9){
            System.out.println("Sobrepeso.");
        }
        else if (resultado > 30 && resultado < 34.9){
            System.out.println("Obesidade Grau 1.");
        }
        else if (resultado > 35 && resultado < 39.9){
            System.out.println("Obesidade Grau 2.");
        }
        else if (resultado > 40){
            System.out.println("Mórbida");
        }



    }

}
