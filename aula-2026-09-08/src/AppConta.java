public class AppConta {
    public static void main(String[] args) {
        Conta cc = new Conta(500);
        cc.depositar(200);
        System.out.println(cc.extrato());


        System.out.println("SALDO");
        System.out.println(cc.getSaldo());
        cc.setSaldo(1000);

        System.out.println("SALDO");
        System.out.println(cc.getSaldo());
    }
}
