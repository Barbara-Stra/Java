package entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio_01 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.printf("\nO número digitado é: %d", numero);

        leitor.close();
    }
}
