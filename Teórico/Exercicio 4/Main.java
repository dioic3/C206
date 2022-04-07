public class Main {
    public static void main(String[] args) {
        Banda banca = new Banda("Didioice", "Pop");

        Membro membro = new Membro("Didioice", "Vocalista");
        Membro membro1 = new Membro("Ana Júlia", "Pianista");
        Membro membro2 = new Membro("Débora", "Baixista");
        Membro membro3 = new Membro("Júlia", "dançarina");
        Membro membro4 = new Membro("Jaqueline","Guitarrista");
        Membro membro5 = new Membro("Joyce", "Tecnica");

        banca.addMembroNovo(membro);
        banca.addMembroNovo(membro1);
        banca.addMembroNovo(membro2);
        banca.addMembroNovo(membro3);
        banca.addMembroNovo(membro4);
        banca.addMembroNovo(membro5);

        //criando as músicas
        Musica musica = new Musica("I love yooou", 3.00);
        Musica musica1 = new Musica("Pudim amassado", 4.01);

        banca.addMusicaNova(musica);
        banca.addMusicaNova(musica1);

        banca.mostrarInfo();

    }
}
