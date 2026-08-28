package trabalhando_com_strings;

import java.util.Scanner;

public class Exercicio_28 {
    static void main() {

        System.out.print("Digite uma senha: ");

        Scanner leitor = new Scanner(System.in);
        String senha = leitor.nextLine();
        leitor.close();

        if (senha.length() >= 8) {
            System.out.printf("A senha tem pelo menos 8 caracteres");
        } else {
            System.out.printf("A senha nao tem pelo menos 8 caracteres");
        }

    }
}
