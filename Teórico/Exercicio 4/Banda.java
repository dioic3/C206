public class Banda {
    private String nome;
    private String genero;
    private Empresario[] empresario;
    private Membro[] membros;
    private Musica[] musicas;
    Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
        membros = new Membro[100];
        musicas = new Musica[10];
    }

    public void addMusicaNova(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                break;
            }
        }
    }
    public void addMembroNovo(Membro membro){
            for(int i = 0; i < membros.length; i++){
                if(membros[i] == null) {
                    membros[i] = membro;
                    break;
                }
            }
    }
    public void mostrarInfo(){
        for(Membro membro : membros) {
            if (membro != null) {
                System.out.println(membro.getNome());
            }
        }
        for(Musica musica: musicas){
            if(musicas != null){
                System.out.println(musica.getNome());
            }
        }
    }
}

