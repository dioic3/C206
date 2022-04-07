public class Principal {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira(1234, "Savaira", "Vende-se esse bicho", 1500, 2, 5000, "inox");
        Fogão fogão = new Fogão(1325, "Savaira", "Vende-se um fogão", 300, 6, "manual", "gás");
        Geladeira geladeira1 = new Geladeira(22, "Savaira", "Vende-se esse bicho", 1500, 2, 5000, "inox");
        Fogão fogão1 = new Fogão(23, "Savaira", "Vende-se um fogão", 300, 6, "manual", "gás");
        Geladeira geladeira2 = new Geladeira(12, "Savaira", "Vende-se esse bicho", 1500, 2, 5000, "inox");
        Fogão fogão2 = new Fogão(14, "Savaira", "Vende-se um fogão", 300, 6, "manual", "gás");

        Mercadoria[] mercadorias = new Mercadoria[10];
        mercadorias[0] = geladeira;
        mercadorias[1] = fogão;
        mercadorias[2] = geladeira1;
        mercadorias[3] = fogão1;
        mercadorias[4] = geladeira2;
        mercadorias[5] = fogão2;

        for (int i = 0; i < mercadorias.length; i++) {
            if (mercadorias[i] != null) {
                if (mercadorias[i] instanceof Geladeira) {
                    Geladeira geladeira3 = (Geladeira) mercadorias[i];
                    geladeira3.mostrarInfo();
                    System.out.println(" ");

                }
                System.out.println(" ");
                if (mercadorias[i] instanceof Fogão) {
                    Fogão fogão3 = (Fogão) mercadorias[i];
                    fogão3.mostrarInfo();
                    System.out.println(" ");
                }
            }
        }
    }
}