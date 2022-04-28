public class Produto implements Comparable<Produto>{
    private String nome;
    int preço;

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public Produto(String nome, int preço){
        this.nome = nome;
        this.preço = preço;
    }
   @Override
    public int compareTo(Produto o){
    return Integer.compare(this.preço, o.preço);
}
   // @Override
   // public int compareTo(Produto o){
     //   return nome.compareTo(o.nome);
   // }

}
