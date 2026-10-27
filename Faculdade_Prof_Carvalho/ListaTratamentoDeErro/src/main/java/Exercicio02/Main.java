package Exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while(!entradaValida) {

            try {
                System.out.println("Digite o nome\n");
                String nome = scanner.nextLine();
                System.out.println("Digite o preco\n");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                Produto produto = new Produto(nome, preco);
                entradaValida = true;

            } catch (IllegalArgumentException exception) {
                System.out.println("O preço não pode ser negativo\n");

            }

        }
    }
}
