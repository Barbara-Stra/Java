package br.com.barbara.tema05;

public abstract class Personagem {
    private int id;
    private String nome;
    private int poderAtaque;
    private double vida;

    public Personagem(int id, String nome, int poderAtaque, double vida) {
        this.id = id;
        this.nome = nome;
        this.poderAtaque = poderAtaque;
        setVida(vida);
    }

    public abstract int atacar();

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setVida(double vida) {
        if(vida < 0){
            this.vida = 0;
        }else{
            this.vida = vida;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }
}
