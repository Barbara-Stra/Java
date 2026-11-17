package br.com.barbara.tema02;

import java.util.List;

public class Main {
    static void main() {

    Equipe equipe1 = new Equipe("Dado");
    Equipe equipe2 = new Equipe("Bola");

    Jogador jogador1 = new Jogador("A", 43, "A", "A");
    Jogador jogador2 = new Jogador("B", 43, "A", "A");
    Jogador jogador3 = new Jogador("C", 56, "A", "A");
    Jogador jogador4 = new Jogador("D", 43, "A", "A");
    Jogador jogador5 = new Jogador("E", 43, "A", "A");

    equipe1.adicionarJogador(jogador1);
    equipe1.adicionarJogador(jogador2);
    equipe2.adicionarJogador(jogador3);
    equipe1.adicionarJogador(jogador4);
    equipe2.adicionarJogador(jogador5);

    PartidaRanqueada partidaRanqueada1 = new PartidaRanqueada(1, 54, "Equipe2");

    PartidaRanqueada partidaRanqueada2 = new PartidaRanqueada(2, 454, "Equipe1");

    PartidaRanqueada partidaRanqueada3 = new PartidaRanqueada(3, 3, "Equipe2");

    PartidaDAO partidaDAO = new PartidaDAO();
    partidaDAO.salvar(partidaRanqueada1);
    partidaDAO.salvar(partidaRanqueada2);
    partidaDAO.salvar(partidaRanqueada3);

    List<Partida> partidas = partidaDAO.buscarTodas();
    for (Partida p : partidas) {
        System.out.println("Partida: " + p.getId() + " duração: " + p.getDuracaoMinutos() + " vencedor: " + p.getVencedor());
    }
    }
}
