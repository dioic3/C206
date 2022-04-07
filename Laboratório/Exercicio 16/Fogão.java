public class Fogão extends Mercadoria{
    private int quantidadeDeBocas;
    private String tipoDeAcendimento;
    private String tipoDeGas;

    public Fogão(int código, String fabricante, String descrição, double valor, int quantidadeDeBocas, String tipoDeAcendimento, String tipoDeGas){
        super(código, fabricante, descrição, valor);
        this.quantidadeDeBocas = quantidadeDeBocas;
        this.tipoDeAcendimento = tipoDeAcendimento;
        this.tipoDeGas = tipoDeGas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("");
        System.out.println("Quantidade de Bocas: " + quantidadeDeBocas);
        System.out.println("Tipo de Acendimento: " + tipoDeAcendimento);
        System.out.println("Tipo de Gás: " + tipoDeGas);
    }
}
