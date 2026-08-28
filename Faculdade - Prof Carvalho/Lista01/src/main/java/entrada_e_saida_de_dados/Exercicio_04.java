package entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio_04 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = leitor.nextDouble();

        System.out.printf("A média aritmética é %.2f", (numero1 + numero2 + numero3) / 3);

        leitor.close();
    }
}
