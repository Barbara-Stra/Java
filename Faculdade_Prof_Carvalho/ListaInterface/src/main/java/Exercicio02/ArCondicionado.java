package Exercicio02;

public class ArCondicionado implements DispositivoEletronico{

    @Override
    public void ligar() {
        System.out.println("Ar condicionao ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Ar condicionado desligado!");
    }
}
