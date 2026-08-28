import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto01 = new Produto("Alicate", 12.45, 99);
        Produto produto02 = new Produto("Lixa", 5.78, 78);
        Produto produto03 = new Produto("Mola", 8.56, 150);

        produtos.add(produto01);
        produtos.add(produto02);
        produtos.add(produto03);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Produto na posição 0: " + produtos.get(0).getNome());

        ProdutoPerecivel produtoPeredicel01 = new ProdutoPerecivel("Leite", 15.67, 8, "16/05/2026");

        produtos.add(produtoPeredicel01);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Produto na posição 0: " + produtos.get(0).getNome());

    }
}
