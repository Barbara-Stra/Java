package Exercicio02;

import java.util.Arrays;

public class ArrayUtil {

    private ArrayUtil() {
    }

    public static int encontrarMaiorNumero(int[] numeros) {
        int maior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
