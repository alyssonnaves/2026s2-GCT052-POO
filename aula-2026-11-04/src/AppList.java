import java.util.ArrayList; // implementa a List
import java.util.Collections;
import java.util.LinkedList;
import java.util.List; // interface

public class AppList {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>(); //  ArrayList<>()

        nomes.add("Jose");
        nomes.add("Maria");
        nomes.add("Joaquim");
        nomes.add("Teresa");
        //if (!nomes.contains("Jose"))
        nomes.add("Jose");
        // nomes.add(8);
        //... 
        System.out.println(nomes);
        System.out.println("FOR I");
        for (int i = 0; i < nomes.size(); i++) { // nomes.size() --> 4
            String elemento = nomes.get(i);   // equivalente nomes[i] em vetores
            System.out.println("Ola " + elemento);
        }

        System.out.println("FOR EACH");
        for (String elemento : nomes) {
            System.out.println("Ola " + elemento);            
        }
        System.out.println("ORDENADA");
        Collections.sort(nomes); //  usa algum de ordenacao (MERGE ou QUICK SORT)
        System.out.println(nomes);
        System.out.println("CONSULTAR SE JOSE ESTA NA LISTA");
        System.out.println(nomes.contains("Jose"));
        System.out.println("CONSULTAR SE Jose Maria ESTA NA LISTA");
        System.out.println(nomes.contains("Jose Maria"));
        System.out.println("REMOVER Maria da lista");
        nomes.remove("Maria"); // pode remover tambem pelo indice
        System.out.println(nomes);
    }
    
}
