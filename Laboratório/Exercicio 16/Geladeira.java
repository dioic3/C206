public class Geladeira extends Mercadoria{
    private int quantidadeDePortas;
    private int tamanhoEmLitros;
    private String inoxornot;

    public Geladeira(int código, String fabricante, String descrição, double valor, int quantidadeDePortas, int tamanhoEmLitros, String inoxornot){
        super(código, fabricante, descrição, valor);
        this.quantidadeDePortas = quantidadeDePortas;
        this.tamanhoEmLitros = tamanhoEmLitros;
        this.inoxornot = inoxornot;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" ");
        System.out.println("Quantidade de Portas: " + quantidadeDePortas);
        System.out.println("Tamanho em Livros: " + tamanhoEmLitros);
        System.out.println("Tipo: " + inoxornot);
    }
}
