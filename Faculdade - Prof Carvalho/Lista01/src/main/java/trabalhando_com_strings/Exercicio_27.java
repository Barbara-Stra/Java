package trabalhando_com_strings;

import java.util.Scanner;

public class Exercicio_27 {
    static void main() {

        System.out.print("Digite uma frase: ");

        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine().toLowerCase();
        leitor.close();

        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == 'a' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }

        System.out.printf("A frase tem %d vogais", cont);

    }
}
