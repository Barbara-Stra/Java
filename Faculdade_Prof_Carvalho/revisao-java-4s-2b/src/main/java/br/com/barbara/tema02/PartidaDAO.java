package br.com.barbara.tema02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO implements PartidaDAOInterface {

    private Connection connection;

    public PartidaDAO() {
        String url = "jdbc:h2:./banco_tema_02";
        String user = "";
        String password = "";

        try {
        connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new IllegalArgumentException("Erro" + e);
        }
    }

    @Override
    public void salvar(Partida p) {


        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS Partida(" +
                "id LONG PRIMARY KEY, " +
                "duracao_minutos INT, " +
                "vencedor VARCHAR(30)" +
                ");";

        String sqlSalvar = "MERGE INTO Partida KEY (id) VALUES (?, ?, ?);";

        try {
            PreparedStatement stmt = connection.prepareStatement(sqlCreateTable);
            stmt.execute();

            stmt = connection.prepareStatement(sqlSalvar);
            stmt.setLong(1, p.getId());
            stmt.setInt(2, p.getDuracaoMinutos());
            stmt.setString(3, p.getVencedor());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new IllegalArgumentException("Erro" + e);
        }
    }

    @Override
    public void excluir(long id) {

    }

    @Override
    public List<Partida> buscarTodas() {
        String sql = "SELECT * FROM Partida;";
        ArrayList<Partida> partidas = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.executeQuery();

            ResultSet rs = stmt.getResultSet();

            while(rs.next()) {
                long id = rs.getLong("id");
                int duracaoMinutos = rs.getInt("duracao_minutos");
                String vencedor = rs.getString("vencedor");

                PartidaRanqueada partidaRanqueada = new PartidaRanqueada(id, duracaoMinutos, vencedor);

                partidas.add(partidaRanqueada);
            }
            return partidas;

        } catch (SQLException e) {
            throw new IllegalArgumentException("Erro" + e);
        }
    }
}
