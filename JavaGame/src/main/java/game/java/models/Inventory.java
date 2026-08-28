package game.java.models;

public class Inventory {
    private Item[][] slots;
    private int rows;
    private int columns;

    public Inventory(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        this.slots = new Item[columns][rows];
    }

    public void addItem(Item item, int column, int row) {
        this.slots[column][row] = item;

        item.setPosition(column, row);
    }

    public void removeItem(int column, int row) {
        slots[column][row] = null;
    }

    public void display() {
        // 1. Primeiro, descobre o maior nome para definir a largura
        int maxNameLength = 10; // tamanho mínimo
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                Item item = slots[col][row];
                if (item != null) {
                    int nameLen = item.getName().length();
                    if (nameLen > maxNameLength) {
                        maxNameLength = nameLen;
                    }
                }
            }
        }

        int cellWidth = maxNameLength + 2; // +2 para espaços laterais

        System.out.println("\n=== INVENTÁRIO ===");

        // Cabeçalho com colunas - AJUSTADO
        System.out.print("     "); // espaço para o número da linha
        for (int col = 0; col < columns; col++) {
            System.out.print("  C" + col + "  ");
            // Adiciona espaços extras para alinhar
            for (int i = 0; i < cellWidth - 4; i++) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Linha separadora superior
        System.out.print("    ");
        for (int col = 0; col < columns; col++) {
            System.out.print("+" + "-".repeat(cellWidth));
        }
        System.out.println("+");

        // Conteúdo - LINHAS
        for (int row = 0; row < rows; row++) {
            // Número da linha
            System.out.print(" L" + row + " ");

            for (int col = 0; col < columns; col++) {
                Item item = slots[col][row];
                if (item != null) {
                    String name = item.getName();
                    // Centraliza ou alinha à esquerda
                    System.out.print("| " + String.format("%-" + maxNameLength + "s", name) + " ");
                } else {
                    System.out.print("| " + " ".repeat(maxNameLength) + " ");
                }
            }
            System.out.println("|");

            // Linha separadora entre linhas
            if (row < rows - 1) {
                System.out.print("    ");
                for (int col = 0; col < columns; col++) {
                    System.out.print("+" + "-".repeat(cellWidth));
                }
                System.out.println("+");
            }
        }

        // Linha separadora inferior
        System.out.print("    ");
        for (int col = 0; col < columns; col++) {
            System.out.print("+" + "-".repeat(cellWidth));
        }
        System.out.println("+");

        // Estatísticas
        int total = columns * rows;
        int used = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (slots[col][row] != null) used++;
            }
        }
        System.out.println("Espaço usado: " + used + "/" + total);
        System.out.println("=================");
    }

}
