package operacoes_matematicas_simples;

import java.util.Scanner;

public class Exercicio_10 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero == 0 ){
            System.out.print("O número é igual a zero");
        } else if (numero > 0) {
            System.out.print("O número é positivo");
        } else {
            System.out.print("O número é negativo");
        }

        leitor.close();
    }
}
