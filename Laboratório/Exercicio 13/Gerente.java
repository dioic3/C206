public class Gerente extends Comum {
    private int bonus;
    Comum comum;

    public Gerente(String nome, int cpf, int matricula, double salario, int bonus){
        super(nome, cpf, matricula, salario);
        this.bonus = bonus;

    }
    public int calcuteBonus(int bonus, int salario){
        return bonus + salario;
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }
}

