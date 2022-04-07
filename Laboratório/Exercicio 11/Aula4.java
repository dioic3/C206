public class Aula4 {
    public static void main(String[] args) {
        Exercicio1 f1;
        Exercicio1 f2;

        //instanciando os objetos
        f1 = new Exercicio1(24, 1234, 1254, "Joyce");
        f2 = new Exercicio1(24, 123456,1234, "Dias");


        //saida de dados
        System.out.println(f1.nome + f1.idade + f1.cpf + f1.salario);
        System.out.println(f2.nome + f2.idade + f2.cpf + f2.salario);

        //variaveis recebendo o valor das funções
        float salarioanul1 = f1.calculoSalarioanul(f1.salario);
        float salarioanul2 = f2.calculoSalarioanul(f2.salario);

        //acessando metodo dos objetos
        f1.tirarFerias("Dezembro");
        f2.tirarFerias("Janeiro");

        //saida de dados
        System.out.println(salarioanul1);
        System.out.println(salarioanul2);

        if (f1 == f2){
            System.out.println("São iguais.");
        }
        else {
            System.out.println("São diferentes");
        }
    }
}
