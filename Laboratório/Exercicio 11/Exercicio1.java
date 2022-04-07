public class Exercicio1 {
    //atributos, caracteriticas do funcionário
    int idade;
    int cpf;
    float salario;
    String nome;

    Exercicio1(int idade, int cpf, float salario, String nome){//construtor é o metodo que chamada assim a classe é instanciada
        //construtor pode ser usado para inicializar os atributos e obriga o desenvolvedor  a fazer de tal maneira
        System.out.println("Funcionário criado.");
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.nome = nome;
        //this serve para referenciar atributos da própria classe e diferenciar variáveis com o mesmo nome

    }
    //as ações ou comportamento do funcionário
    void tirarFerias(String mes){
        System.out.println(nome + "vai tirar ferias em" + mes);
    }
    float calculoSalarioanul(float decimoTeceiro){
        float salarioAnual = salario * 12;
        salarioAnual += decimoTeceiro;
        return salarioAnual;
    }
}

