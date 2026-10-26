package Exercicio03;

public class Main {
    static void main() {

        ConsultorExterno consultarExterno = new ConsultorExterno();
        Desenvolvedor desenvolvedor = new Desenvolvedor();

        consultarExterno.trabalharDeCasa();
        desenvolvedor.trabalharDeCasa();
    }
}
