package barbara;

public class Hangar {
    private String nome;
    private int capacidadeMaxima;
    private NaveEspacial[] naveEspaciais;
    private int posicaoAtual;
    private AgenciaEspacial agenciaEspacial;

    public Hangar(String nome, int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.nome = nome;
        this.naveEspaciais = new NaveEspacial[capacidadeMaxima];
        this.posicaoAtual = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNave(NaveEspacial nave) {
        if(posicaoAtual < capacidadeMaxima) {
            naveEspaciais[posicaoAtual] = nave;
            nave.setHangar(this);
            posicaoAtual++;
        } else {
            System.out.println("Não é possível estacionar mais naves no hangar\n");
        }
    }

    public void setAgenciaEspacial(AgenciaEspacial agenciaEspacial) {
        this.agenciaEspacial = agenciaEspacial;
    }

    public AgenciaEspacial getAgenciaEspacial() {
        return agenciaEspacial;
    }
}
