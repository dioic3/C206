public class Calculadora {
    private int x;
    private int y;
    private int result;
//O uso da palavra estatica faz com que o atributo seja comum para todos os objetos da mesma classe.
    //Pode ser usado quando deseja ter controle sobre os objetos ou compartilhamento de informações
    public static int soma(int x, int y){
        return (x + y);
    }
    public static int subtrair(int x, int y){
        return x - y;
    }
    public static int multiplicar(int x, int y){
        return x * y;
    }
    public static int dividir(int x, int y){
        return (x/y);
    }

}

