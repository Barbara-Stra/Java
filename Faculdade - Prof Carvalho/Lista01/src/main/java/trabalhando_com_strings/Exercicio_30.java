package trabalhando_com_strings;

import java.util.Scanner;

public class Exercicio_30 {

    static void main() {

        System.out.print("Digite uma palavra: ");

        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine().toLowerCase();
        leitor.close();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(invertida)) {
            System.out.printf("A palavra é um palindromo");
        } else {
            System.out.printf("A palavra não é um palindromo");
        }
    }
}
