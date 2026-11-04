import java.util.ArrayList;
import java.util.List;

public class AppListVenda {
    public static void main(String[] args) {
        List<String> vendas = new ArrayList<>();
        vendas.add("Mouse");
        vendas.add("Teclado");
        System.out.println(vendas);
        vendas.set(1, "Monitor");
        System.out.println(vendas);

        System.out.println("Removendo o item com valor 0");
        List<Integer> numeros = new ArrayList<>(List.of(50, 0, 80, 0));
        System.out.println(numeros);
        numeros.removeIf(valor -> valor == 0);
        System.out.println(numeros); // [50, 80]

    }
}
