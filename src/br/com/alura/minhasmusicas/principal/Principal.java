package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("The Fresh Price of Bel-Air");
        musica.setArtista("DJ Jazzy Jeff & the Fresh Prince");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Guilherme");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }
    }
}
