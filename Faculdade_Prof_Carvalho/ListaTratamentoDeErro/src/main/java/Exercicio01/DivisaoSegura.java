package Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while(!entradaValida) {

            try {
            System.out.println("Digite 2 numeros inteiros\n");

                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                int resultado = n1 / n2;

                entradaValida = true;

            } catch (InputMismatchException exception) {
                System.out.println("digite numeros inteiros\n");

            } catch (ArithmeticException exception) {
                System.out.println("nao da pra fazer divisao por 0\n");
            }

            scanner.nextLine();
        }
    }
}
