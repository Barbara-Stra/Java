package Exercicio01;

public class Livro {
    private static int contadorDeLivros;

    public Livro() {
        contadorDeLivros++;
    }

    public static int getContadorDeLivros() {
        return contadorDeLivros;
    }
}
