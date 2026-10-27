package Exercicio05;

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
                System.out.println("Digite a idade\n");
                int idade = scanner.nextInt();
                scanner.nextLine();

                if (idade < 0) {
                    throw new IllegalArgumentException();
                }

                entradaValida = true;

            } catch (InputMismatchException exception) {
                System.out.println("Idade invalida\n");

            } catch (IllegalArgumentException exception) {
                System.out.println("Idade não pode ser negativa.\n");
            }
        }
    }
}
