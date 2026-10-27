package Exercicio02;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException();
        }

        this.nome = nome;
        this.preco = preco;
    }
}
