package br.com.barbara.tema03;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private ArrayList<VeiculoEco> frota;

    public List<CarroEletrico> listarApenasCarros() {

        ArrayList carros = new ArrayList<>();

        for (int i = 0; i < frota.size(); i++) {
            if (frota.get(i) instanceof CarroEletrico) {
                carros.add(frota.get(i));
            }
        }
        return carros;
    }
}
