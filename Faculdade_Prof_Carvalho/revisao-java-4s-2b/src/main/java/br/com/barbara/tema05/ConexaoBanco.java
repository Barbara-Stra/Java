package br.com.barbara.tema05;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection getConnection(){
        try{
            String url = "jdbc:h2:./meu_banco";
            String user = "";
            String password = "";

            return DriverManager.getConnection(url, user, password);

        }catch(SQLException e) {
            throw new IllegalArgumentException("Falha ao se conectar ao banco! | " + e);
        }
    }
}
