package br.com.barbara.tema04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String url = "jdbc:h2:./banco_tema_04";
    private static final String senha = "";
    private static final String user = "";

    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(url, user, senha);

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
