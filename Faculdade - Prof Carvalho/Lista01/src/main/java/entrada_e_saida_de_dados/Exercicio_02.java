package entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio_02 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.printf("Bem-vindo(a), %s!", nome);

        leitor.close();
    }
}
