import java.util.Scanner;

public class Desafio {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        String menu = """
                       Operações
                       
                       1 - Consultar saldos
                       2 - Receber Valor
                       3 - Transferir valor
                       4 - Sair
                       
                       Digite a opções desejada:
                       """;
        float saldo = 0, valorRecebido, valorTransferido;
        int sair = 0;

        do {
            System.out.println("********************");
            System.out.println(menu);
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    leitura.nextLine();
                    break;

                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    valorRecebido = leitura.nextFloat();
                    saldo += valorRecebido;
                    break;

                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    valorTransferido = leitura.nextFloat();
                    saldo -= valorTransferido;
                    break;

                case 4:
                    sair = 1;
                    break;
            }

        } while (sair != 1);
    }
}
