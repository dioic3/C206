public class Pessoafisica extends Conta {
    private String nome;
    private long cpf;
    private int saldo = 0;

    Pessoafisica(int identificação, String agência, String nome, long cpf, int saldo) {
        super(identificação, agência);
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void criandoConta() {
        System.out.println("Sua conta foi criada!");
    }
}
