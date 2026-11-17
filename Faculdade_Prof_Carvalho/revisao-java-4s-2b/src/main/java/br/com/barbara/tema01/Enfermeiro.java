package br.com.barbara.tema01;

public class Enfermeiro extends ProfissionalSaude{
    private String coren;
    private int horasAdicionaisNoturnas;

    public Enfermeiro(long id, String nome, String setor, double salarioBase, String coren, int horasAdicionaisNoturnas) {
        super(id, nome, setor, salarioBase);
        this.coren = coren;
        this.horasAdicionaisNoturnas = horasAdicionaisNoturnas;
    }

    @Override
    public double calcularPagamentoFinal() {
        return getSalarioBase() + (80 * horasAdicionaisNoturnas);
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public int getHorasAdicionaisNoturnas() {
        return horasAdicionaisNoturnas;
    }

    public void setHorasAdicionaisNoturnas(int horasAdicionaisNoturnas) {
        if(horasAdicionaisNoturnas < 0 || horasAdicionaisNoturnas > 120) {
            throw new PlantaoInvalidoException();
        } else {
            this.horasAdicionaisNoturnas = horasAdicionaisNoturnas;
        }
    }
}
