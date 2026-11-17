package br.com.barbara.tema01;

public class Main {
    static void main() {

        String sql = "CREATE TABLE IF NOT EXISTS profissional (" +
                "id INT PRIMARY KEY, " +
                "nome VARCHAR(100), " +
                "setor VARCHAR(50), " +
                "salario_base DOUBLE, " +
                "tipo_profissional VARCHAR(30), " +
                "crm VARCHAR(30), " +
                "cirurgias INT, " +
                "coren VARCHAR(30), " +
                "horas_noturnas INT" +
                ");";
    }
}
