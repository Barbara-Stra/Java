package br.edu.unicesumar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nomeDigitado = leitor.nextLine();

        Connection conexao = ConexaoBanco.getConexao();

        CrudUsuario crud = new CrudUsuario(conexao);

        crud.criarTabela();
        Usuario murilo = new Usuario(11, nomeDigitado);
        crud.inserirUsuarioSeguro(murilo);
    }
}
