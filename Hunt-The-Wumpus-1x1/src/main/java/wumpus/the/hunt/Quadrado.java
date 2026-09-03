package wumpus.the.hunt;

public class Quadrado {
    private int id;
    private String conteudo;

    public Quadrado(int id){
        this.id = id;
        this.conteudo = "0";
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
