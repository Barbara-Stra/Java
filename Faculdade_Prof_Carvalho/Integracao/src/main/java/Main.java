import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:h2:./meu_banco";
        String user = "sa";
        String password = "";

        try (Connection  x = DriverManager.getConnection(url, user, password)) {

            Statement stm = x.createStatement();
            stm.execute("CREATE TABLE IF NOT EXISTS usuario(id INT, nome VARCHAR(255));");

            int result = stm.executeUpdate("INSERT INTO usuario(id, nome) values (1, 'teste');");
            System.out.println("qtd: " + result);;

        } catch (SQLException ex) {
            System.out.println("Deu ruim" + ex);
        }
    }
}
