package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero == 0) {
            System.out.print("O número não tem paridade");
        } else if (numero % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é impar");
        }
    }
}
