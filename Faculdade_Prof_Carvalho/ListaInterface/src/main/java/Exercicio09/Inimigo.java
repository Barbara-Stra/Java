package Exercicio09;

public class Inimigo extends Personagem implements FicavelInvisivel{
    @Override
    public void ficarInvisivel() {
        System.out.println("Ficou invisivel");
    }
}
