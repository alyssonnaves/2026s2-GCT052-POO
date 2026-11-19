public class Overflow {
    public static void main(String[] args) {
        int numero = 127;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        char letra = 'a';
        System.out.println(letra);
        letra++;
        System.out.println(letra);
    }   
}
