package barbara;

public class Engenheiro {
    private String nome;
    private String crea;

    public Engenheiro(String nome, String crea) {
        this.nome = nome;
        this.crea = crea;
    }

    public void inspecionar(NaveEspacial naveEspacial) {
        System.out.printf("O engenheiro %s inspecionou a nave %s\n", this.nome, naveEspacial.getNome());
    }
}
