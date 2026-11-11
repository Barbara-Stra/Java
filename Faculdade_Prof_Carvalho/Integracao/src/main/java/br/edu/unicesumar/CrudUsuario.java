package br.edu.unicesumar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudUsuario {

    private Connection conexao;

    public CrudUsuario(Connection conexao){
        this.conexao = conexao;
    }

    public void criarTabela(){
        try {

            Statement veiculo = conexao.createStatement();

            veiculo.execute("CREATE TABLE IF NOT EXISTS usuario(" +
                    "id INT, " +
                    "nome VARCHAR(50))" +
                    ";");

            System.out.println("Conexao feita com sucesso");
        }catch (SQLException exception){

            System.out.println("Erro ao conectar com o banco " + exception);
        }
    }

    public void inserirUsuario(Usuario novoUsuario){

        try {
            Statement veiculo = conexao.createStatement();

            String insert = "INSERT IGNORE INTO usuario(id, nome) VALUES (" + novoUsuario.getId() + ", '" + novoUsuario.getNome() + "');";

            int resultant = veiculo.executeUpdate(insert);

            if (resultant == 1){
                System.out.println("Usuario inserido com sucesso");
            } else {
                System.out.println("Insert nao executado");
            }
        }catch (SQLException exception){
            System.out.println("Erro ao inserir Usuario");
        }

    }

    public void inserirUsuarioSeguro(Usuario novoUsuario){

        try {
            PreparedStatement veiculo = conexao.prepareStatement("INSERT IGNORE INTO usuario(id, nome) VALUES (?, ?)");

            veiculo.setInt(1, novoUsuario.getId());
            veiculo.setString(2, novoUsuario.getNome());

            int resultant = veiculo.executeUpdate();

            if (resultant == 1){
                System.out.println("Usuario inserido com sucesso");
            } else {
                System.out.println("Insert nao executado");
            }
        }catch (SQLException exception){
            System.out.println("Erro ao inserir Usuario");
        }

    }
}
