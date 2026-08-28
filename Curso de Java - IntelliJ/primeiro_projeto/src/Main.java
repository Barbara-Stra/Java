public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Anp de Lancamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        double temperatura = 5.4;
        double farenheit = (temperatura * 1.8) + 32;
        System.out.println(farenheit);

        int conversao = (int) (farenheit);
        System.out.println(conversao);

        double nota1 = 6.8, nota2 = 6.5;
        double mediaInteira = (nota1 + nota2) / 2;
        System.out.println("A media inteira é: " + mediaInteira);
        int mediaNaoInteira = (int) (mediaInteira);
        System.out.println("A media não inteira é: " + mediaNaoInteira);
    }
}