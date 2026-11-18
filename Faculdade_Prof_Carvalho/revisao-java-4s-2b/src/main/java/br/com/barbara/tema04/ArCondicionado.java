package br.com.barbara.tema04;

public class ArCondicionado extends DispositivoInteligente {
    private int temperatura;

    public ArCondicionado(String macAdress, int consumoWatts, boolean statusLigado, int temperatura) {
        super(macAdress, consumoWatts, statusLigado);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
