package trabalhando_com_strings;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_29 {
    static void main() {

        System.out.print("Digite um nome: ");

        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine().toLowerCase();
        leitor.close();
        

        if (nome.startsWith("a")) {
            System.out.printf("O nome comeca com a letras a");
        } else {
            System.out.printf("O nome nao comeca com a letras a");
        }

    }
}
