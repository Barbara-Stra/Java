package br.com.barbara.tema01;

public abstract class ProfissionalSaude {
    private long id;
    private String nome;
    private String setor;
    private double salarioBase;

    public ProfissionalSaude(long id, String nome, String setor, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamentoFinal();
}
