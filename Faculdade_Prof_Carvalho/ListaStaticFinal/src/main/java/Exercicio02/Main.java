package Exercicio02;

public class Main {
    static void main() {

        int[] numeros = {3, 2, 5, 4};

        System.out.println(ArrayUtil.encontrarMaiorNumero(numeros));

        //Eu a implementaria como um metodo estatico na classe FinanceiroUtil, pois essa classe nao depende de metodos e instancias de objetos, ela apenas precisa de parametros de entrada. Alem de que uma calculadora de juros nao guarda nenhuma variavel, ela seria um objeto vazio
    }
}
