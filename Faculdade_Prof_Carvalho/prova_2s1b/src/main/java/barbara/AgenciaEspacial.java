package barbara;

import java.util.ArrayList;

public class AgenciaEspacial {
    private String nome;
    private String sigla;
    private ArrayList<Hangar> hangars;
    private CentroControle centroControle;

    public AgenciaEspacial(String nome, String sigla, String nomeDiretor) {
        this.nome = nome;
        this.sigla = sigla;
        this.hangars = new ArrayList<Hangar>();
        centroControle = new CentroControle(nomeDiretor);
        centroControle.setAgenciaEspacial(this);
    }

    public void adicionarHangar(Hangar hangar){
        hangars.add(hangar);
        hangar.setAgenciaEspacial(this);
    }

    public String getNome() {
        return nome;
    }
}
