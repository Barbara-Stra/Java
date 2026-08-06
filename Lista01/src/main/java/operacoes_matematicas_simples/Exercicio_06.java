package operacoes_matematicas_simples;

import java.util.Scanner;
import java.util.Random;

public class Exercicio_06 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitor.nextDouble();

        System.out.printf("O dobro dele é: %.2f", numero * 2);
        System.out.printf("\nO triplo dele é: %.2f", numero * 3);
        System.out.printf("\nA raiz quadrada dele é: %.2f", Math.sqrt(numero));

        leitor.close();
    }
}
