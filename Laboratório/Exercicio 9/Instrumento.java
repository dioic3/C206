public class Instrumento {
    private static int contador = 0;
    private String nomeDoInstrumento;
    private int quantidadeDeCordas;
    public Instrumento(String nomeDoInstrumento, int quantidadeDeCordas){
        this.nomeDoInstrumento = nomeDoInstrumento;
        this.quantidadeDeCordas = quantidadeDeCordas;
        System.out.println("Criando o instrumento pipipopop");
        contador++;
    }
    public static int quantidadeMáximaDeInstrumentos(){
        return contador;
    }
    public void mostrarInfo(){
        System.out.println("Nome do instrumento: " + nomeDoInstrumento);
        System.out.println("Quantidade de cordas: " + quantidadeDeCordas);
    }
}
