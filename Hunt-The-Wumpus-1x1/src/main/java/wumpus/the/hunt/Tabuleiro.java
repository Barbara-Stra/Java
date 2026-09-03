package wumpus.the.hunt;

import java.util.Random;

public class Tabuleiro {
    private Quadrado[][] salas;
    private static final int CONS = 5;

    public Tabuleiro() {
        int x = 0;
        Random random = new Random();
        int colunaAleatoria = random.nextInt(CONS);
        int linhaAleatoria = random.nextInt(CONS);
        salas = new Quadrado[CONS][CONS];

        for (int i = 0; i < CONS; i++) {
            for (int j = 0; j < CONS; j++) {

                salas[i][j] = new Quadrado(x++);
            }
        }

        int i = 0;
        do {
            if (i == 0) {
                colunaAleatoria = random.nextInt(CONS);
                linhaAleatoria = random.nextInt(CONS);

                salas[colunaAleatoria][linhaAleatoria].setConteudo("P");
            }
            if (i == 1) {
                colunaAleatoria = random.nextInt(CONS);
                linhaAleatoria = random.nextInt(CONS);

                salas[colunaAleatoria][linhaAleatoria].setConteudo("W");
            }
            if (i == 2) {
                colunaAleatoria = random.nextInt(CONS);
                linhaAleatoria = random.nextInt(CONS);

                salas[colunaAleatoria][linhaAleatoria].setConteudo("A");
            }
            i++;
        } while (i < 3);
    }

    public void mostrarTabuleiro() {
        for (int i = 0; i < CONS; i++) {
            for (int j = 0; j < CONS; j++) {
                System.out.print(salas[i][j].getConteudo() + " ");
            }
            System.out.println();
        }
    }

}
