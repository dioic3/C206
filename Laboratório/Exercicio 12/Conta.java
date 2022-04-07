public class Conta {
    protected int identificação;
    protected String agência;

    public Conta(int identificação, String agência){
        this.identificação = identificação;
        this.agência = agência;
    }
    public void criandoConta(){
        System.out.println("Sua conta foi criada!");
    }
    public void retornar()
    {
        System.out.println("Sua identificação é " + identificação);
        System.out.println("Sua agência é " + agência);
    }
}
