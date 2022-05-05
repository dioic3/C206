package dioice.inatel;
import dioice.inatel.model.Seriado;
import dioice.inatel.excet.TemporadaExpection;

import dioice.inatel.control.*;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Seriado> listadeSeriado = new ArrayList<>();
        Arquivo arquivo = new Arquivo();

        try {
            Seriado seriado1 = new Seriado();
            seriado1.setNome("Gossip Girl");
            seriado1.setTemporadas(1);
            seriado1.setStreaming("Netflix");
            seriado1.setAnoCriacao(2005);

            if (seriado1.getTemporadas() <= 1) {
                throw new TemporadaExpection("Número da sua temporada é um, impossivel cadastrar!");
            }
            listadeSeriado.add(seriado1);
            arquivo.escrever(seriado1);
        } catch (TemporadaExpection e) {
            System.out.println(e);
        } finally {
            System.out.println("Continuando o programa");
        }

        try {
            Seriado seriado2 = new Seriado();
            seriado2.setNome("Shadowhunters");
            seriado2.setTemporadas(9);
            seriado2.setStreaming("Netflix");
            seriado2.setAnoCriacao(2021);

            if (seriado2.getTemporadas() <= 1) {
                throw new TemporadaExpection("Número da sua temporada é um, impossivel cadastrar!");
            }
            listadeSeriado.add(seriado2);
            arquivo.escrever(seriado2);
        } catch (TemporadaExpection e) {
            System.out.println(e);
        } finally {
            System.out.println("Continuando o programa");
        }

        try {
            Seriado seriado3 = new Seriado();
            seriado3.setNome("The Witcher");
            seriado3.setTemporadas(11);
            seriado3.setStreaming("Netflix");
            seriado3.setAnoCriacao(2022);

            if (seriado3.getTemporadas() <= 1) {
                throw new TemporadaExpection("Número da sua temporada é um, impossivel cadastrar!");
            }
            listadeSeriado.add(seriado3);
            arquivo.escrever(seriado3);
        } catch (TemporadaExpection e) {
            System.out.println(e);
        } finally {
            System.out.println("Continuando o programa");
        }

        try {
            Seriado seriado4 = new Seriado();
            seriado4.setNome("Friends");
            seriado4.setTemporadas(12);
            seriado4.setStreaming("Netflix");
            seriado4.setAnoCriacao(2005);

            if (seriado4.getTemporadas() <= 1) {
                throw new TemporadaExpection("Número da sua temporada é um, impossivel cadastrar!");
            }
            listadeSeriado.add(seriado4);
            arquivo.escrever(seriado4);
        } catch (TemporadaExpection e) {
            System.out.println(e);
        } finally {
            System.out.println("Continuando o programa");
        }

        ArrayList<Seriado> Seriespostadas = new ArrayList<>();
        Seriespostadas = arquivo.ler();

        for (Seriado seriesAtual: Seriespostadas){
            System.out.println("Nome: " + seriesAtual.getNome());
            System.out.println("Temporadas: " + seriesAtual.getTemporadas());
            System.out.println("Streaming: " + seriesAtual.getStreaming());
            System.out.println("Ano de criação: " + seriesAtual.getAnoCriacao());
            System.out.println("");
        }
        Collections.sort(Seriespostadas);
        System.out.println("Crescente:");
        for (Seriado seriesAtual: Seriespostadas){
            System.out.println("Nome: " + seriesAtual.getNome());
            System.out.println("Temporadas: " + seriesAtual.getTemporadas());
            System.out.println("Streaming: " + seriesAtual.getStreaming());
            System.out.println("Ano de criação: " + seriesAtual.getAnoCriacao());
            System.out.println("");
        }

        Collections.reverse(Seriespostadas);

        System.out.println("Decrescente:");

        for (Seriado seriesAtual: Seriespostadas){
            System.out.println("Nome: " + seriesAtual.getNome());
            System.out.println("Temporadas: " + seriesAtual.getTemporadas());
            System.out.println("Streaming: " + seriesAtual.getStreaming());
            System.out.println("Ano de criação: " + seriesAtual.getAnoCriacao());
            System.out.println("");
        }
    }

}