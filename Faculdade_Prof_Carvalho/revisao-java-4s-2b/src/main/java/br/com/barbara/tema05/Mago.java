package br.com.barbara.tema05;

public class Mago extends Personagem{
    private int mana;

    public Mago(int id, String nome, int poderAtaque, int mana, double vida) {
        super(id, nome, poderAtaque, vida);
        this.mana = mana;
    }
    @Override
    public int atacar(){
        return (getPoderAtaque() + (mana/2));
    }

    public int getMana() {
        return mana;
    }
}
