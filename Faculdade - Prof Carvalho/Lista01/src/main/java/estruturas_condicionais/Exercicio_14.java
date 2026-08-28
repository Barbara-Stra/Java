package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        System.out.print("Digite sua idade: ");

        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();

        if (idade < 18) {
            System.out.print("Você é menor de idade");
        } else {
            System.out.print("Você é maior de idade");
        }
    }
}
