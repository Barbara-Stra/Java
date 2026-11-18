package br.com.barbara.tema04;

import java.util.ArrayList;

public class Comodo {
    private String nome;
    private int cargaMaximaWatts;
    private ArrayList<DispositivoInteligente> dispositivoInteligentes;

    public Comodo(String nome, int cargaMaximaWatts) {
        this.nome = nome;
        this.cargaMaximaWatts = cargaMaximaWatts;
        this.dispositivoInteligentes = new ArrayList<>();
    }

    public void instalarDispositivo (DispositivoInteligente d) {
        int soma = 0;

        for (DispositivoInteligente i : dispositivoInteligentes) {
            soma += i.getConsumoWatts();
        }

        soma += d.getConsumoWatts();

        if (soma > cargaMaximaWatts) {
            throw new SobrecargaEletricaException("Limite de Watts atingido!");
        } else {
            dispositivoInteligentes.add(d);
        }
    }

    public int getCargaMaximaWatts() {
        return cargaMaximaWatts;
    }

    public ArrayList<DispositivoInteligente> getDispositivoInteligentes() {
        return dispositivoInteligentes;
    }
}
