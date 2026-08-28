package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = leitor.nextLine();

        if (senha.equals("1234")) {
            System.out.print("Acesso permitido");
        } else {
            System.out.print("Acesso negado");
        }

        leitor.close();
    }
}
