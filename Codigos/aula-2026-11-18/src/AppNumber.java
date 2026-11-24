public class AppNumber {

    public static double dividir(double a, double b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Divisao por 0");
        }
        return a/b;

    }

    public static void main(String[] args) {
        try {
            System.out.println("1");
            String valor = "5a";
            int n = Integer.parseInt(valor); //  converte de string para inteiro
            System.out.println("2: " + n);
        } catch (Exception e) {
            System.out.println("3: entrada invalida: " + e.getMessage());
        }
        System.out.println("4: fim");

        try{
            double r = dividir(3, 4);
            System.out.println("5: resultado: " + r);
        }catch(ArithmeticException e){
            System.out.println("6: por conta da divisao por 0");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("7: Fim divisao");
        }
    }
}
