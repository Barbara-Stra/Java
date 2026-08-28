package trabalhando_com_strings;

import java.util.Scanner;

public class Exercicio_26 {
    static void main() {

        System.out.print("Digite uma palavra: ");

        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();
        leitor.close();

        String invertida = new StringBuilder(palavra).reverse().toString();

        System.out.printf("invertida - %s", invertida);
    }
}
