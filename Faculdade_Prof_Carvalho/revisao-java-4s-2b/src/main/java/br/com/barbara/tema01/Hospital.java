package br.com.barbara.tema01;

import java.util.List;

public class Hospital implements AuditoriaInterface {
    private String nome;
    private ProfissionalSaude[] profissionaisSaude;

    public Hospital(String nome, ProfissionalSaude[] profissionaisSaude) {
        this.nome = nome;
        this.profissionaisSaude = new ProfissionalSaude[50];
    }

    public void adicionarProfissional(ProfissionalSaude p) {
        for (int i = 0; i < profissionaisSaude.length; i++) {
            if (profissionaisSaude.equals("")) {
                profissionaisSaude[i] = p;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfissionalSaude[] getProfissionaisSaude() {
        return profissionaisSaude;
    }

    public void setProfissionaisSaude(ProfissionalSaude[] profissionaisSaude) {
        this.profissionaisSaude = profissionaisSaude;
    }

    @Override
    public void gerarLog(String acao) {
        System.out.println("O Hospital: " + this.getNome() + "Realizou: " + acao);
    }
}
