package br.com.barbara.tema02;

import java.util.List;

public interface PartidaDAOInterface {

    void salvar(Partida p);
    void excluir(long id);
    List<Partida> buscarTodas();
}
