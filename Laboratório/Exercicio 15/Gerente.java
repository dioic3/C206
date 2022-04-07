public class Gerente extends Funcionario implements ContrataFuncionario{
    private String senhaAcesso;
    private double bonus;

    public Gerente(String nome, int horasTrabalhadas, double salarioHora, int matricula, String senhaAcesso, double bonus) {
        super(nome, horasTrabalhadas, salarioHora, matricula);
        this.senhaAcesso = senhaAcesso;
        this.bonus = bonus;
    }
    @Override
    public void apresentar() {
        //super.apresentar();
        System.out.println("Sou um gerente com senha de acesso " + senhaAcesso);
    }

    @Override
    public void criaProcessoSeletivo() {
        System.out.println("Criando processo seletivo");
    }

    @Override
    public void agendaEntrevista() {
        System.out.println("Agendando uma entervista");
    }

}

