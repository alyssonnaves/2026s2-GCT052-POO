public class Exemplo002 {
    public static void main(String[] args) {
        byte numero = 127;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero++;
        System.out.println(Byte.toUnsignedInt(numero));
        int bilhao = 1000000000;
        int bilhaoTmp = 1_000_000_000;
        System.out.println(bilhao);
        System.out.println(bilhaoTmp);
        
    }
}
