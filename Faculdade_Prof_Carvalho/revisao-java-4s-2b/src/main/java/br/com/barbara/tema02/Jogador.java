package br.com.barbara.tema02;

public class Jogador {
    private String nickname;
    private int nivel;
    private int pontosRanqueada;
    private ContaLogin contaLogin;
    private Equipe equipeAtual;

    public Jogador(String nickname, int nivel, String email, String senhaHash) {
        this.nickname = nickname;
        this.nivel = nivel;
        this.pontosRanqueada = 0;
        ContaLogin contaLogin = new ContaLogin(email, senhaHash);
    }

    public void setEquipeAtual(Equipe equipeAtual) {
        this.equipeAtual = equipeAtual;
    }

    public void entrarEmFila() {
        try {
            if (this.nivel < 5) {
                throw new JogadorBanidoException();
            }
            System.out.println("Em fila");
        }catch (JogadorBanidoException e) {
            System.out.println("Erro ao entrar na fila: " + e);
        }
    }
}
