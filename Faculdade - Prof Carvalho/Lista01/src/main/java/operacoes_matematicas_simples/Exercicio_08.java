package operacoes_matematicas_simples;

import java.util.Scanner;

public class Exercicio_08 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitor.nextDouble();

        System.out.printf("O quadrado dele é: %.2f, e o cubo dele é: %.2f", numero * numero, Math.pow(numero, 3));

        leitor.close();
    }
}
