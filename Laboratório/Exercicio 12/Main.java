public class Main{
    public static void main(String[] args) {
        Pessoajuridica pessoajuridica = new Pessoajuridica(13456,"Banco do Brasil","Dioice",87348,50000,60000);
        Pessoafisica pessoafisica = new Pessoafisica(256378,"Banco do Brasil","Dioice",9898898,300);

        Conta[] conta = new Conta[4];
        conta[0] = pessoafisica;
        conta[1] = pessoajuridica;

        for(Conta contas: conta){
            if (contas instanceof Pessoafisica){
                Pessoafisica pessoafisica1 = (Pessoafisica) contas;
                pessoafisica1.setCpf(123456);
                pessoafisica1.getCpf();
                pessoafisica1.criandoConta();
            }
            if(contas instanceof Pessoajuridica){
                Pessoajuridica pessoajuridica1 = (Pessoajuridica) contas;
                pessoajuridica1.criandoConta();
            }
        }
    }
}
