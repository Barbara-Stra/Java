package br.com.barbara.tema04;

import java.sql.*;

public class DispositivoDAO {

    public void criarTabelaDispositivo(Connection connection) {
        try {

            Statement stmt = connection.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS Dispositivo (" +
                    "tipo_dispositivo VARCHAR(20), " +
                    "mac_adress VARCHAR(20), " +
                    "consumo_watts INT, " +
                    "status_ligado BOOLEAN, " +
                    "temperatura INT, " +
                    "cor_hexadecimal VARCHAR(20)" +
                    ");");

            System.out.println("Tabela Criada com sucesso");

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível criar a tabela" + e);
        }
    }

    public void inserir(Connection connection, ArCondicionado d) {

        String sql = "INSERT INTO Dispositivo (tipo_dispositivo, mac_adress, consumo_watts, status_ligado, temperatura) VALUES (?,?,?,?,?);";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, "Ar Condicionado");
            stmt.setString(2, d.getMacAdress());
            stmt.setInt(3, d.getConsumoWatts());
            stmt.setBoolean(4, d.isLigado());
            stmt.setInt(5, d.getTemperatura());

            stmt.executeUpdate();

            System.out.println("Ar inserido com sucesso");

        } catch (SQLException e) {
        throw new IllegalArgumentException("Não foi possível inserir o dispositivo Ar" + e);
        }
    }

    public void inserir(Connection connection, LampadaRGB d) {

        String sql = "INSERT INTO Dispositivo (tipo_dispositivo, mac_adress, consumo_watts, status_ligado, cor_hexadecimal) VALUES (?,?,?,?,?);";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, "Lampada RGB");
            stmt.setString(2, d.getMacAdress());
            stmt.setInt(3, d.getConsumoWatts());
            stmt.setBoolean(4, d.isLigado());
            stmt.setString(5, d.getCorHexadecimal());

            stmt.executeUpdate();

            System.out.println("Lampada inserida com sucesso");

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível inserir o dispositivo Lampada" + e);
        }
    }

    public void alterarStatus (Connection connection, String macAdress, boolean novoStatus) {
        String sql = "UPDATE Dispositivo SET status_ligado = ? WHERE mac_adress = ?;";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setBoolean(1, novoStatus);
            stmt.setString(2, macAdress);

            stmt.executeUpdate();

            System.out.println("Status alterado com sucesso");

        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível alterar o status" + e);
        }
    }
}
