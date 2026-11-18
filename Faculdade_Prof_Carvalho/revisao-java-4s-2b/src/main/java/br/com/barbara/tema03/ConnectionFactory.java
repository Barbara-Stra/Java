package br.com.barbara.tema03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String url = "jdbc:h2:./banco_tema_03";
    private static final String usuario = "";
    private static final String senha = "";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {
            throw new IllegalArgumentException("Erro ao se conectar com o banco" + e);
        }
    }
}
