package Exercicio02;

public class ValidacaoUtil {

    private ValidacaoUtil() {
    }

    public static boolean isEmailValido(String email){
        if (email.contains("@gmail.com")){
            return true;
        } else {
            return false;
        }
    }
}
