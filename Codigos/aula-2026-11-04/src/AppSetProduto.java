import java.util.HashSet;
import java.util.Set;

public class AppSetProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("001", "Mouse", "Mouse sem fio");
        Produto p2 = new Produto("002", "Teclado", "Teclado mecânico");
        Produto p3 = new Produto("003", "Monitor", "Monitor Full HD");
        Produto p4 = new Produto("001", "Mouse", "Mouse sem fio");
        Produto p5 = new Produto("002", "Teclado", "Teclado mecânico");

        Set<Produto> produtos = new HashSet<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4); // nao deveria ser adicionado
        produtos.add(p5); // nao deveria ser adicionado
        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println("Produtos cadastrados:");
        System.out.println(produtos);
    }
}
