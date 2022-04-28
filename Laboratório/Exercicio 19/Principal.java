import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Coca",3);
        Produto produto2 = new Produto("Oreo",4);
        Produto produto3 = new Produto("Cheetos", 1);
        Produto produto4 = new Produto("Nescau", 0);
        Produto produto5 = new Produto("Toddy", 7);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        Collections.sort(produtos);

        for(Produto produto6: produtos){
            System.out.println("Produto: " + produto6.getNome());
            System.out.println("Preço: " + produto6.getPreço());
        }

        System.out.println("-----------");
        Collections.reverse(produtos);
        for(Produto produto7: produtos){
            System.out.println("Produto: " + produto7.getNome());
            System.out.println("Preço: " + produto7.getPreço());
        }
        System.out.println("---------------");




    }
}
