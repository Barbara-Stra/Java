package br.edu.unicesumar;

public class ValorMenorZeroExeption extends Exception {

    public ValorMenorZeroExeption() {
        super("Valor não pode ser menor que zero");
    }

}
