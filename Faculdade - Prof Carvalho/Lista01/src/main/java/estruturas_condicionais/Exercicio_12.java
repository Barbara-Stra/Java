package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = leitor.nextDouble();

        if (numero1 == numero2) {
            System.out.print("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.printf("O primeiro número é maior (%.2f)", numero1);
        } else if (numero2 > numero1) {
            System.out.printf("O segundo número é maior (%.2f)", numero2);
        }
    }
}
