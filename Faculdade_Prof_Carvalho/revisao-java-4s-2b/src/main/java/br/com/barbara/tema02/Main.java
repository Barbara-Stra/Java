package br.com.barbara.tema02;

import java.sql.Connection;
import java.util.List;

public class Main {
    static void main() {


        Connection conexao = ConnectionFactory.getConnection();

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


        PartidaRanqueada partida1 = new PartidaRanqueada(30, "Teste partida 1", "Prata");
        PartidaTreino partida2 = new PartidaTreino(10, "Teste partida2", 50);
        PartidaTreino partida3 = new PartidaTreino(10, "Teste partida3", 50);

        PartidaDAO crud = new PartidaDAO(conexao);

        crud.createTable();
        crud.salvar(partida2);
        crud.salvar(partida1);
        crud.salvar(partida3);

        crud.excluir(4);

        List<Partida> busca = crud.buscarTodos();

        for (Partida p : busca) {
            System.out.println(p);
        }
    }
}
