package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogado2 = new Jogador("Garrincha");
        Jogador jogado3 = new Jogador("Nilton Santos");
        Jogador[] jogadores = {jogador1, jogado2, jogado3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
