package Exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while(!entradaValida) {

            try {
                System.out.println("Digite um numero\n");

                String n1 = scanner.nextLine();
                Integer.parseInt(n1);

                entradaValida = true;

            } catch (NumberFormatException exception) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.\n");
            }
        }
    }
}
