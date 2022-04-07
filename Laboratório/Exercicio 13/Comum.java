public class Comum {
    private String nome;
    private int cpf;
    private int matricula;
    private double salario;

    Comum(String nome, int cpf, int matricula, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

}
