package Exercicio07;

public class Main {
    static void main() {

        Produto produto = new Produto("jabuticaba", 2000);
        Usuario usuario = new Usuario("Penelope", "kaae");

        System.out.println(usuario.toCSV());
        System.out.println(produto.toCSV());
    }
}
