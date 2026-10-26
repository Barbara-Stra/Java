package Exercicio02;

public class Lampada implements DispositivoEletronico{

    @Override
    public void ligar() {
        System.out.println("Lampada ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada desligado");
    }
}
