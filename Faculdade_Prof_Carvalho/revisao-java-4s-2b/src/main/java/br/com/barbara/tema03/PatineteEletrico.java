package br.com.barbara.tema03;

public class PatineteEletrico extends VeiculoEco{

    private boolean requerCapacete;

    public PatineteEletrico(String chassi, int taxaDiaria, int autonimiaBateriaAtual, boolean requerCapacete) {
        super(chassi, taxaDiaria, autonimiaBateriaAtual, "PATINETE");
        this.requerCapacete = requerCapacete;
    }

    public PatineteEletrico(String chassi, int taxaDiaria, boolean requerCapacete) {
        super(chassi, taxaDiaria, "PATINETE");
        this.requerCapacete = requerCapacete;
    }

    @Override
    public double calcularCusto(int dias) {

        if (requerCapacete) {
            return (getTaxaDiaria() * dias) + 15.0;
        } else {
            return (getTaxaDiaria() * dias);
        }
    }

    public boolean isRequerCapacete() {
        return requerCapacete;
    }

    @Override
    public String toString() {
        return "PatineteEletrico{" +
                "requerCapacete=" + requerCapacete +
                '}';
    }
}
