package operacoes_matematicas_simples;

import java.util.Scanner;

public class Exercicio_09 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        double maior = 0;
        double menor = 0;

        if(numero1 == numero2) {
            System.out.print("Eles são iguais");
            System.exit(0);
        } else if (numero1 > numero2) {
            maior = numero1;
            menor = numero2;
        } else if (numero2 > numero1) {
            maior = numero2;
            menor = numero1;
        }

        System.out.printf("O maior numero é: %.2f", maior);
        System.out.printf("\nO menor numero é: %.2f", menor);

        leitor.close();
    }
}
