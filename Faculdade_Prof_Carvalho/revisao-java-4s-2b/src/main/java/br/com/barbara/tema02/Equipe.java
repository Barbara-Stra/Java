package br.com.barbara.tema02;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j) {
        this.jogadores.add(j);
        j.setEquipeAtual(this);
    }
}
