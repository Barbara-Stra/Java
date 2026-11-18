package br.com.barbara.tema01;

public class Medico extends ProfissionalSaude{
    private String crm;
    private int cirurgiasRealizadas;

    public Medico(long id, String nome, String setor, double salarioBase, String crm, int cirurgiasRealizadas) {
        super(id, nome, setor, salarioBase);
        this.crm = crm;
        this.cirurgiasRealizadas = cirurgiasRealizadas;
    }

    @Override
    public double calcularPagamentoFinal(){
        return getSalarioBase() + (500 * cirurgiasRealizadas);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getCirurgiasRealizadas() {
        return cirurgiasRealizadas;
    }

    public void setCirurgiasRealizadas(int cirurgiasRealizadas) {
        this.cirurgiasRealizadas = cirurgiasRealizadas;
    }
}
