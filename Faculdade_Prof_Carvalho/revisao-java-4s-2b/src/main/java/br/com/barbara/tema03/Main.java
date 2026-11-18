package br.com.barbara.tema03;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    static void main() {

        Connection connection = ConnectionFactory.getConnection();

        VeiculoDAO  veiculoDAO= new VeiculoDAO();
        veiculoDAO.criarTabela(connection);

        CarroEletrico carro01 = new CarroEletrico("A", 14, 40, 34);
        CarroEletrico carro02 = new CarroEletrico("B", 14, 40, 43);
        CarroEletrico carro03 = new CarroEletrico("E", 15, 234, 4);

        PatineteEletrico patinete01 = new PatineteEletrico("G", 53, false);
        PatineteEletrico patinete02= new PatineteEletrico("G", 53, true);

        veiculoDAO.inserirCarro(carro01, connection);
        veiculoDAO.inserirCarro(carro02, connection);
        veiculoDAO.inserirCarro(carro03, connection);

        veiculoDAO.inserirPatinete(patinete01, connection);
        veiculoDAO.inserirPatinete(patinete02, connection);

        ArrayList<VeiculoEco> veiculoEcos = new ArrayList<>();

        veiculoEcos.add(carro01);
        veiculoEcos.add(carro02);
        veiculoEcos.add(carro03);
        veiculoEcos.add(patinete01);
        veiculoEcos.add(patinete02);

        for (VeiculoEco v : veiculoEcos) {
            System.out.println(v.calcularCusto(5));
        }

    }
}
