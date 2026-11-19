public class AppNumber {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            int n = Integer.parseInt("5a");
            System.out.println("2: " + n);
        } catch (NumberFormatException e) {
            System.out.println("3: entrada invalida: " + e.getMessage());
        }
        System.out.println("4: fim");
    }
}
