import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int numeroDigitado = 101;
        int contador = 0;

        do {
            System.out.println("Digite um número");
            numeroDigitado = leitura.nextInt();
            contador++;

            if (numeroDigitado > aleatorio) {
                System.out.println("O numero Digitado é maior");
            }

            if (numeroDigitado < aleatorio) {
                System.out.println("O numero Digitado é menor");
            }

        } while (numeroDigitado != aleatorio && contador < 5);

    }
}
