import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        // List<String> emails = new ArrayList<>();
        emails.add("d@a.com.br"); // nao vou visualizar T ou F
        System.out.println(emails.add("a@a.com.br")); // T
        System.out.println(emails.add("b@a.com.br")); // T
        System.out.println(emails.add("c@a.com.br")); // T
        System.out.println(emails.add("a@a.com.br")); // F
        System.out.println(emails.add("c@a.com.br")); // F
        System.out.println(emails);

    }    
}
