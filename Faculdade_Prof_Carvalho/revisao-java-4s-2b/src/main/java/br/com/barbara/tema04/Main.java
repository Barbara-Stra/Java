package br.com.barbara.tema04;

import java.sql.Connection;

public class Main {
    static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();

        ArCondicionado arCondicionado = new ArCondicionado("92133", 10, true, 10);
        LampadaRGB lampadaRGB = new LampadaRGB("0231", 20, false, "23");
        Comodo comodo = new Comodo("Cozinha", 15);

        DispositivoDAO dispositivoDAO = new DispositivoDAO();
        dispositivoDAO.criarTabelaDispositivo(connection);

        dispositivoDAO.inserir(connection, arCondicionado);

        dispositivoDAO.alterarStatus(connection, arCondicionado.getMacAdress(), true);
    }
}
