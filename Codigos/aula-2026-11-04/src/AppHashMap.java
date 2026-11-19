import java.util.HashMap;
import java.util.Map;

public class AppHashMap {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("SKU-001", 5);
        estoque.put("SKU-002", 10);

        System.out.println(estoque.get("SKU-003"));
        System.out.println(estoque.containsKey("SKU-001"));

        if (!estoque.containsKey("SKU-003")){
            estoque.put("SKU-003", 20);
        }
    }
}
