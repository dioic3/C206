public abstract class Mercadoria implements Informações {
    protected int código;
    protected String fabricante;
    protected String descrição;
    protected double valor;

    public Mercadoria(int código, String fabricante, String descrição, double valor) {
        this.código = código;
        this.fabricante = fabricante;
        this.descrição = descrição;
        this.valor = valor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Código: " + código);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Descrição: " + descrição);
        System.out.println("Valor: " + valor);
        System.out.println(" ");
    }

}
