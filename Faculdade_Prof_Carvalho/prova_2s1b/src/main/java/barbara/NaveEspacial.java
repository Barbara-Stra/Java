package barbara;

public class NaveEspacial {
    private String nome;
    private double pesoToneladas;
    private int anoFabricacao;
    private Hangar hangar;

    public NaveEspacial(String nome, double pesoToneladas, int anoFabricacao) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;

        if(pesoToneladas < 0) {
            this.pesoToneladas = 0;
        } else {
            this.pesoToneladas = pesoToneladas;
        }
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public String getNome() {
        return nome;
    }

    public Hangar getHangar() {
        return hangar;
    }
}
