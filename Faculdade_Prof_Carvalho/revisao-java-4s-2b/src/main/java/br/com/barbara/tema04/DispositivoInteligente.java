package br.com.barbara.tema04;

public abstract class DispositivoInteligente implements ControleRemotoInterface {
    private String macAdress;
    private int consumoWatts;
    private boolean statusLigado;

    public DispositivoInteligente(String macAdress, int consumoWatts, boolean statusLigado) {
        this.macAdress = macAdress;
        this.consumoWatts = consumoWatts;
        this.statusLigado = statusLigado;
    }

    public int getConsumoWatts() {
        return consumoWatts;
    }

    @Override
    public void ligar() {
        this.statusLigado = true;
    }

    @Override
    public void desligar() {
        this.statusLigado = false;
    }

    @Override
    public boolean isLigado() {
        return this.statusLigado;
    }

    public String getMacAdress() {
        return macAdress;
    }
}
