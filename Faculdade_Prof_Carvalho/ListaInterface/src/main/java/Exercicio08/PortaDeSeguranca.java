package Exercicio08;

public class PortaDeSeguranca implements DispositivoEletronico, Autenticavel{

    @Override
    public void autenticar(String senha) {
        System.out.println("Autenticado");
    }

    @Override
    public void ligar() {
        System.out.println("Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Desligado");
    }
}
