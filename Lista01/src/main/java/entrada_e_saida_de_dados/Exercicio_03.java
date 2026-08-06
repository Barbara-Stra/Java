package entrada_e_saida_de_dados;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.printf("A soma desses números é: %.2f", numero1 + numero2);

        leitor.close();
    }
}