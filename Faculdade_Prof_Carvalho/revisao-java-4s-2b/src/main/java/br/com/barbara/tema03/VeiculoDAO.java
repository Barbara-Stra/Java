package br.com.barbara.tema03;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {

    public List<PatineteEletrico> contarPatinetesCadastrados(Connection connection) {

        ArrayList<PatineteEletrico> patinetes = new ArrayList<>();

        try {

            Statement stmt = connection.createStatement();
            ResultSet resultadoBusca = stmt.executeQuery("SELECT COUNT(*) FROM Veiculo WHERE tipo = 'PATINETE';");

            while (resultadoBusca.next()) {
                String chassi = resultadoBusca.getString("chassi");
                int taxaDiaria = resultadoBusca.getInt("taxa_diaria");
                int autonimiaBateriaAtual = resultadoBusca.getInt("autonimia_bateria_atual");
                String tipo = resultadoBusca.getString("tipo");
                boolean requerCapacete = resultadoBusca.getBoolean("requer_capacete");
                int quantidadeAssentos = resultadoBusca.getInt("quantidade_assentos");

                if (requerCapacete) {
                    PatineteEletrico patinete = new PatineteEletrico("A", 10, 20, true);
                    patinetes.add(patinete);
                }
            }
            return patinetes;

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível contar o número de patinetes");
        }
    }

    public void criarTabela(Connection connection) {

        try {

            Statement stmt = connection.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS Veiculo(" +
                    "chassi VARCHAR(30), " +
                    "taxa_diaria INT, " +
                    "autonomia_bateria_atual INT, " +
                    "tipo VARCHAR(20), " +
                    "requer_capacete BOOLEAN, " +
                    "quantidade_assentos INT" +
                    ");");

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível criar tabela");
        }
    }

    public void inserirCarro(CarroEletrico veiculoEco, Connection connection) {

        String sql = "INSERT INTO Veiculo (chassi, taxa_diaria, autonomia_bateria_atual, tipo, quantidade_assentos) VALUES (?,?,?,?,?);";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, veiculoEco.getChassi());
            stmt.setInt(2, veiculoEco.getTaxaDiaria());
            stmt.setInt(3, veiculoEco.getAutonimiaBateriaAtual());
            stmt.setString(4, veiculoEco.getTipo());
            stmt.setInt(5, veiculoEco.getQuantidadeAssentos());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível inserir veiculo" + e);
        }
    }

    public void inserirPatinete(PatineteEletrico veiculoEco, Connection connection) {

        String sql = "INSERT INTO Veiculo (chassi, taxa_diaria, autonomia_bateria_atual, tipo, requer_capacete) VALUES (?,?,?,?,?);";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, veiculoEco.getChassi());
            stmt.setInt(2, veiculoEco.getTaxaDiaria());
            stmt.setInt(3, veiculoEco.getAutonimiaBateriaAtual());
            stmt.setString(4, veiculoEco.getTipo());
            stmt.setBoolean(5, veiculoEco.isRequerCapacete());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível inserir veiculo" + e);
        }
    }
}
