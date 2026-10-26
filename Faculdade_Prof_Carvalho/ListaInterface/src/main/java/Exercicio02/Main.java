package Exercicio02;

public class Main {
    static void main() {
        ArCondicionado arCondicionado = new ArCondicionado();
        Lampada lampada = new Lampada();

        arCondicionado.ligar();
        lampada.ligar();
        lampada.desligar();
        arCondicionado.desligar();
    }
}
