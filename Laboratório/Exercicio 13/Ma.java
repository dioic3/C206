public class Ma {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joyce",12355,1898,15000,300);
        Comum[] comums = new Comum[10];

        comums[0] = gerente;
        for(Comum comum: comums){
            if(comum instanceof Gerente){
                Gerente gerente1 = (Gerente) comum;
                gerente.getSalario();
                System.out.println(gerente.calcuteBonus());
            }
        }
    }
}
