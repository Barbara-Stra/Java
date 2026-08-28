package entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio_05 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.printf("O antecessor é %d", numero1 - 1);
        System.out.printf("\nO sucessor é %d", numero1 + 1);

        leitor.close();
    }
}
