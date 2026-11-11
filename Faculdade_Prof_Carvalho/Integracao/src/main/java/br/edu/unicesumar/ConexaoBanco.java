package br.edu.unicesumar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static Connection getConexao(){
        try {

            String url = "jdbc:mysql://localhost:3306/banco_aula";
            String usuario = "root";
            String senha = "";

            Connection connection = DriverManager.getConnection(url, usuario, senha);

            return connection;

        }catch (SQLException exception){
            throw new IllegalArgumentException("Erro ao se conectar com o banco");
        }
    }
}
