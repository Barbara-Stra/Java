package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {

        double total = 0;

        ContaCorrente contaCorrente = new ContaCorrente(470);
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println(contaCorrente.getValorImposto());
        System.out.println(seguroDeVida.getValorImposto());

        List<Tributavel> tributavels = new ArrayList<>();

        tributavels.add(contaCorrente);
        tributavels.add(seguroDeVida);

        for (Tributavel tributavel : tributavels) {
            System.out.println(tributavel.getValorImposto());
            total += tributavel.getValorImposto();
        }

        System.out.printf("%f", total);
    }
}
