package br.com.barbara.tema05;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonagemDAO {
    private Connection connection = ConexaoBanco.getConnection();

    public PersonagemDAO() {
        String sql = "CREATE TABLE IF NOT EXISTS Personagem (" +
                "id INT PRIMARY KEY, " +
                "nome VARCHAR(30), " +
                "vida DOUBLE, " +
                "poder_ataque INT, " +
                "classe_personagem VARCHAR(20), " +
                "armadura INT, " +
                "mana INT " +
                ");";

        try(Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(sql);

        }catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível criar a Tabela do Personagem | " + e);
        }
    }

    public void salvar(Personagem p) {
        String sql = "MERGE INTO Personagem (id, nome, vida, poder_ataque, classe_personagem, armadura, mana) " +
                "KEY(id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";

        try(PreparedStatement stmt = connection.prepareStatement(sql);) {

            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setDouble(3, p.getVida());
            stmt.setDouble(4, p.getPoderAtaque());

            if(p instanceof Guerreiro) {
                stmt.setString(5, "GUERREIRO");
                stmt.setDouble(6, ((Guerreiro) p).getArmadura());
                stmt.setNull(7, Types.INTEGER);
            } else {
                stmt.setString(5, "MAGO");
                stmt.setNull(6, Types.INTEGER);
                stmt.setDouble(7, ((Mago) p).getMana());
            }

            stmt.executeUpdate();

        }catch (SQLException e) {
            throw new IllegalArgumentException("Não foi salvar o personagem | " + e);
        }
    }

    public List<Personagem> buscarTodos() {
        String sql = "SELECT * FROM Personagem; ";

        ArrayList<Personagem> personagems = new ArrayList<>();

        try(PreparedStatement stmt = connection.prepareStatement(sql);) {
            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                String classe = rs.getString("classe_personagem");
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int poderAtaque = rs.getInt("poder_ataque");
                double vida = rs.getDouble("vida");

                if (classe.equals("GUERREIRO")) {
                    int armadura = rs.getInt("armadura");
                    Guerreiro g = new Guerreiro(id, nome, poderAtaque, armadura, vida);
                    personagems.add(g);

                } else if (classe.equals("MAGO")) {
                    int mana = rs.getInt("mana");
                    Mago m = new Mago(id, nome, poderAtaque, mana, vida);
                    personagems.add(m);
                }
            }

            return personagems;

        }catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível buscar os personagens | " + e);
        }
    }
}
