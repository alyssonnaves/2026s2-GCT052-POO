public class AppMetodos {
    public static void main(String[] args) {
        Conta cc = new Conta(102, "Alan Turing");
        // cc.saldo = 1000;
        cc.info();
        cc.depositar(525);
        cc.info();
        cc.depositar(1000);
        cc.info();
        cc.limite = 2000;
        cc.sacar(500);
        cc.info();
        cc.sacar(1000);
        cc.info();
        cc.sacar(30);
        cc.info();
        cc.sacar(5000);
        cc.info();
    }
}
