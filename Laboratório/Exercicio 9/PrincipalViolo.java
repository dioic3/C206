public class PrincipalViolo {
    public static void main(String[] args) {
        Instrumento instrumento1 = new Instrumento("Bateria", 9);
        Instrumento instrumento2 = new Instrumento("Violino", 4);
        Instrumento instrumento3 = new Instrumento("Guitarra", 6);
        Instrumento instrumento4 = new Instrumento("Banjo", 8);
        Instrumento instrumento5 = new Instrumento("Piano",0);
        Instrumento instrumento6 = new Instrumento("Violão", 6);

        instrumento1.mostrarInfo();
        System.out.println(" ");
        instrumento2.mostrarInfo();
        System.out.println(" ");
        instrumento3.mostrarInfo();
        System.out.println(" ");
        instrumento4.mostrarInfo();
        System.out.println(" ");
        instrumento5.mostrarInfo();
        System.out.println(" ");
        instrumento6.mostrarInfo();

        System.out.println(" ");
        System.out.println("Total de instrumentos existentes na loja:");
        System.out.println(Instrumento.quantidadeMáximaDeInstrumentos());

    }

}
