public class Exemplo001 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int maiorInt = Integer.MIN_VALUE;
        int menorInt = Integer.MAX_VALUE;
        System.out.println(maiorInt);
        System.out.println(menorInt);

        System.out.println(args);
        int qtd = args.length;
        System.out.println("tamanho: " + qtd );
        for (int i = 0; i < args.length; i++) {
            System.out.print("indice " + i + ":");
            System.out.println(args[i]);
        }

        
    }
}