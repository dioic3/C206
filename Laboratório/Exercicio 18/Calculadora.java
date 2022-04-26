public class Calculadora {
    private int x;
    private int y;
    private int result;

    public Calculadora(int x, int y){
        if(x > 100 || y > 100){
            throw new RuntimeException("Entre com valores abaixo de 100!");
        }
        else{
            this.x = x;
            this.y = y;
        }
    }

    //lógica de negocio:
    //divisão por zero
    //minimo de divisão
    public void soma(int x, int y){
        result = (x + y);
        System.out.println("Soma:" + result);
    }
    public void subtrair(int x, int y){
        result = x - y;
        System.out.println("Subtração:" + result);
    }
    public void  multiplicar(int x, int y){
        result = x * y;
        System.out.println("Multiplicar:" + result);
    }
    public void dividir(int x, int y) {
       if(y == 0){
        throw new RuntimeException("Não é possivel executar divisão por 0!");
       }else{
        result = (x / y);
        System.out.println("Divisão:" + result);
   }
    }
}