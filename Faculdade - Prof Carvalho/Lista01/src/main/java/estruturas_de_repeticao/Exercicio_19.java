package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio_19 {
    static void main() {
        System.out.printf("Digite um número: ");

        Scanner leitor= new Scanner(System.in);
        int numero = leitor.nextInt();
        leitor.close();

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d ", numero * i);
        }

    }
}
