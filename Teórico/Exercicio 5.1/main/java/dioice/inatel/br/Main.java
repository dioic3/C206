package dioice.inatel.br;
import dioice.inatel.br.mamifero.Boi;
import dioice.inatel.br.mamifero.Cachorro;
import dioice.inatel.br.mamifero.Lontra;
import dioice.inatel.br.mamifero.Mamifero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*entrada = instanciando para usar a função da classe scanner
        O array MamiferoArraylist vai armazenar as informações dos animais or mamiferos
        A variavelAuxiliar vai servir para armazenar os nomes de cada classe filha
        A listaAuxiliar vai ser usada como auxiliar, assim vai guardar as informações dos mamiferos.
         */
        Scanner entrada = new Scanner(System.in);
        ArrayList<Mamifero> mamiferoArrayList = new ArrayList<>();
        String variavelAuxiliar;
        ArrayList<String> listaAuxiliar = new ArrayList<>();

        System.out.println("Entre com o nome do seu mascote: ");
        for(int i = 0; i < 6; i++){
            variavelAuxiliar = entrada.nextLine();
            listaAuxiliar.add(variavelAuxiliar);
        }

        Mamifero mamifero1 = new Cachorro(listaAuxiliar.get(0), new Random().nextDouble()*100);
        Mamifero mamifero2 = new Cachorro(listaAuxiliar.get(1), new Random().nextDouble()*100);
        Mamifero mamifero3 = new Lontra(listaAuxiliar.get(2), new Random().nextDouble()*100);
        Mamifero mamifero4 = new Lontra(listaAuxiliar.get(3), new Random().nextDouble()*100);
        Mamifero mamifero5 = new Boi(listaAuxiliar.get(4), new Random().nextDouble()*100);
        Mamifero mamifero6 = new Boi(listaAuxiliar.get(5), new Random().nextDouble()*100);

        mamiferoArrayList.add(mamifero1);
        mamiferoArrayList.add(mamifero2);
        mamiferoArrayList.add(mamifero3);
        mamiferoArrayList.add(mamifero4);
        mamiferoArrayList.add(mamifero5);
        mamiferoArrayList.add(mamifero6);

        System.out.println("Resposta do array: ");
        for (int i = 0; i < mamiferoArrayList.size(); i++){
            System.out.println("Nome: " + mamiferoArrayList.get(i).getNome());
            System.out.println("Vida: " + mamiferoArrayList.get(i).getVida());
        }

        Collections.sort(mamiferoArrayList, Collections.reverseOrder());
        System.out.println("Array ordenado em forma decrescente:");
        for (int i = 0; i < mamiferoArrayList.size(); i++){
            System.out.println("Nome: " + mamiferoArrayList.get(i).getNome());
            System.out.println("Vida: " + mamiferoArrayList.get(i).getVida());
        }

        entrada.close();
    }
}
