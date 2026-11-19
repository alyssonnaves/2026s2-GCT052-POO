import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMap {
    public static void main(String[] args) {
        Map<String, Double> tabela = new HashMap<>();
        tabela.put("Prod01", 1.0);
        tabela.put("Prod10", 10.0);
        tabela.put("Prod20", 20.0);
        tabela.put("Prod30", 30.0);
        tabela.put("Prod40", 40.0);
        tabela.put("Prod40", 45.0);

        System.out.println(tabela);

        System.out.println(tabela.get("Prod40"));

        List<String> lista = new  ArrayList<>();
    }
}
