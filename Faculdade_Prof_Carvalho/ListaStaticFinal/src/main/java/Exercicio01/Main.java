package Exercicio01;

public class Main {
    static void main() {
        Produto ameixa = new Produto(12.3);
        Produto jabuticaba = new Produto(23.21);

        System.out.println(ameixa.getPrecoImposto());
        System.out.println(jabuticaba.getPrecoImposto());

        Produto.setTaxaImposto(0.10);
        System.out.println(ameixa.getPrecoImposto());
        System.out.println(jabuticaba.getPrecoImposto());

        //4 - a diferença é que o preço é individual para cada produto, já a taxaImposto vale para todos os produtos. A taxaImposto é a lei da república, e o preco é a placa de valor de cada monumento (objetos)

        //5 - Não, porque o metodo static surge antes dos objetos, então não é possível acessar um preco de um objeto especifico (usando o this), sendo que pode nem existir objetos quando alguem for usar o metodo statico
    }
}
