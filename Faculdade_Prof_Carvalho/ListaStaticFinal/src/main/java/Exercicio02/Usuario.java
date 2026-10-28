package Exercicio02;

public class Usuario {
    private String email;

    public void setEmail(String email) {
        boolean validado = ValidacaoUtil.isEmailValido(email);
        if(validado) {
            this.email = email;
        }
    }
}
