package br.com.barbara.tema02;

import java.util.List;

public interface PartidaDAOInterface {

    void salvar(PartidaRanqueada partida);
    void salvar(PartidaTreino partida);
    void excluir(int id);
    List<Partida> buscarTodos();

}