package operacoes_matematicas_simples;

import java.util.Scanner;

public class Exercicio_07 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        final double TAXA_FIXA = 5.25;

        System.out.print("Digite o valor em reais a ser convertido: ");
        double numero = leitor.nextDouble();

        System.out.printf("O valor em dólares é: %.2f", numero / TAXA_FIXA);

        leitor.close();
    }
}
