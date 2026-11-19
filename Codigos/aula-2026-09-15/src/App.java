import modelos.Conta;

public class App {
    public static void main(String[] args) {
        Conta cc1 = new Conta(1000,200);
        Conta cc2 = new Conta(2500,500);
        Conta cc3 = new Conta(5000,400);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        System.out.println("Total de contas");
        System.out.println(Conta.getTotalContas());
        // System.out.println(cc2.getTotalContas());
        // System.out.println(Integer.toBinaryString(9));

        
    }
}
