package br.com.barbara.tema01;

public class PlantaoInvalidoException extends RuntimeException {
    public PlantaoInvalidoException() {
        super(
                "Horas inválidas para o mês"
        );
    }
}
