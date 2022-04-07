public class Pessoajuridica extends Conta {
    private String nome;
    private long cnpj;
    private int saldo = 0;
    private int limite_financiamento = 60000;

    Pessoajuridica(int identificação, String agência, String nome, long cnpj, int saldo, int limite_financiamento) {
        super(identificação, agência);
        this.nome = nome;
        this.cnpj = cnpj;
        this.saldo = saldo;
        this.limite_financiamento = limite_financiamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimite_financiamento() {
        return limite_financiamento;
    }

    public void setLimite_financiamento(int limite_financiamento) {
        this.limite_financiamento = limite_financiamento;
    }
}