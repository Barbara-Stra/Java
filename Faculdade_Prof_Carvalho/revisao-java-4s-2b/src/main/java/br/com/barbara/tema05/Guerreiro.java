package br.com.barbara.tema05;

public class Guerreiro extends Personagem{
    private int armadura;

    public Guerreiro(int id, String nome, int poderAtaque, int armadura, double vida) {
        super(id, nome, poderAtaque, vida);
        this.armadura = armadura;
    }

    @Override
    public int atacar(){
        return getPoderAtaque() + 10;
    }

    public int getArmadura() {
        return armadura;
    }
}
