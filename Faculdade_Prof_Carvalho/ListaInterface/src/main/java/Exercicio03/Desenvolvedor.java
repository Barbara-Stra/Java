package Exercicio03;

public class Desenvolvedor extends Funcionario implements TrabalhavelRemotamente {

    @Override
    public void trabalharDeCasa() {
        System.out.println("Desenvolvedor trabalhando remotamente");
    }
}