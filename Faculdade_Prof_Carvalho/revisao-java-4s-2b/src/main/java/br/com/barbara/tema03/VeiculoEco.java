package br.com.barbara.tema03;

public abstract class VeiculoEco {

    private String chassi;
    private int taxaDiaria;
    private int autonimiaBateriaAtual;
    private String tipo;

    public VeiculoEco(String chassi, int taxaDiaria, int autonimiaBateriaAtual, String tipo) {
        this.chassi = chassi;
        this.taxaDiaria = taxaDiaria;
        this.autonimiaBateriaAtual = autonimiaBateriaAtual;
        this.tipo = tipo;
    }

    public VeiculoEco(String chassi, int taxaDiaria, String tipo) {
        this.chassi = chassi;
        this.taxaDiaria = taxaDiaria;
        this.autonimiaBateriaAtual = 100;
        this.tipo = tipo;
    }

    public abstract double calcularCusto(int dias);

    public String getChassi() {
        return chassi;
    }

    public int getTaxaDiaria() {
        return taxaDiaria;
    }

    public int getAutonimiaBateriaAtual() {
        return autonimiaBateriaAtual;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "VeiculoEco{" +
                "chassi='" + chassi + '\'' +
                ", taxaDiaria=" + taxaDiaria +
                ", autonimiaBateriaAtual=" + autonimiaBateriaAtual +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
