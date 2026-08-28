package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = leitor.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("O primeiro número é maior (%.2f)", numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("O segundo número é maior (%.2f)", numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.printf("O terceiro número é maior (%.2f)", numero3);
        }

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.printf("\nO primeiro número é menor (%.2f)", numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.printf("O segundo número é menor (%.2f)", numero2);
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.printf("O terceiro número é menor (%.2f)", numero3);
        }

        leitor.close();
    }
}
