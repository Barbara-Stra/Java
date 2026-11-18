package br.com.barbara.tema04;

public class LampadaRGB extends DispositivoInteligente {
    private String corHexadecimal;

    public LampadaRGB(String macAdress, int consumoWatts, boolean statusLigado, String corHexadecimal) {
        super(macAdress, consumoWatts, statusLigado);
        this.corHexadecimal = corHexadecimal;
    }

    public String getCorHexadecimal() {
        return corHexadecimal;
    }
}
