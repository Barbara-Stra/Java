package barbara;

public class Sonda extends NaveEspacial{
    private String tipoSensor;

    public Sonda(String nome, double pesoToneladas, int anoFabricacao, String tipoSensor) {
        super(nome, pesoToneladas, anoFabricacao);
        this.tipoSensor = tipoSensor;
    }
}
