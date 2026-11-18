package br.com.barbara.tema03;

public class CarroEletrico extends VeiculoEco{

    private int quantidadeAssentos;

    public CarroEletrico(String chassi, int taxaDiaria, int autonimiaBateriaAtual, int quantidadeAssentos) {
        super(chassi, taxaDiaria, autonimiaBateriaAtual, "CARRO");
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public CarroEletrico(String chassi, int taxaDiaria, int quantidadeAssentos) {
        super(chassi, taxaDiaria, "CARRO");
        this.quantidadeAssentos = quantidadeAssentos;
    }

    @Override
    public double calcularCusto(int dias) {
        return (getTaxaDiaria() * dias) * 1.15;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "quantidadeAssentos=" + quantidadeAssentos +
                '}';
    }
}
