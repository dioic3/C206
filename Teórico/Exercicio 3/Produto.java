public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }
    void mostrarInfo(){
        System.out.println("Código de série: " + codigoSerie);
        System.out.println("Codigo de Produto: " + codigoProduto);
        System.out.println("Nome do material:" + nome);
        System.out.println("Categoria do material: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }
}
