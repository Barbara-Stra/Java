package br.com.barbara.tema02;

public abstract class Partida {
    private long id;
    private int duracaoMinutos;
    private String vencedor;

    public Partida(long id, int duracaoMinutos, String vencedor) {
        this.id = id;
        this.duracaoMinutos = duracaoMinutos;
        this.vencedor = vencedor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

}
