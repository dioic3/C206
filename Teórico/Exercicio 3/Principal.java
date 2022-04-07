public class Principal {
    public static void main(String[] args) {
        Produto one = new Produto(1233,"145265789","Pudim","primeira", 500);
        Produto two = new Produto(1234, "15637567","Maça","segunda",700);

        //Saída de dados
        System.out.println("Informações do primeiro produto.");
        System.out.println("Codigo de Série: " + one.codigoSerie);
        System.out.println("Codigo de Produto: " + one.codigoProduto);
        System.out.println("Nome: " + one.nome);
        System.out.println("Categoria: " + one.categoria);
        System.out.println("Quantidade: " + one.quantidade);

        System.out.println("Informações do segundo produto.");
        System.out.println("Codigo de Série: " + two.codigoSerie);
        System.out.println("Codigo de Produto: " + two.codigoProduto);
        System.out.println("Nome: " + two.nome);
        System.out.println("Categoria: " + two.categoria);
        System.out.println("Quantidade: " + two.quantidade);
    }
}
