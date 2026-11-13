package br.edu.unicesumar;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Connection conexao = ConexaoBanco.getConexao();

        CrudUsuario crudUsuario = new CrudUsuario(conexao);
        crudUsuario.criarTabela();

        Usuario arthur = new Usuario(3, "Arthur");
        Usuario pedro = new Usuario(4, "Pedro");

        //crudUsuario.cadastrarUsuario(arthur);
        //crudUsuario.cadastrarUsuario(pedro);
        List<Usuario> resultadoConsulta = crudUsuario.buscarUsuarios();

        for (Usuario usuario : resultadoConsulta){
            System.out.println(usuario);
        }

        crudUsuario.deletarUsuario(4);

        for (Usuario usuario : resultadoConsulta){
            System.out.println(usuario);
        }

    }
}