public class App {
    // metodo = funcao pra exibir os dados
    // public static void info(Conta c){
    //     System.out.println("Numero: " + c.numero);
    //     System.out.println("Titular: " + c.titular);
    //     System.out.println("Saldo: R$ " + c.saldo );
    //     System.out.println("Limite: R$ " + c.limite);
    // }

    public static void main(String[] args) {
        Conta cc1 = new Conta(54);
        Conta cc2 = new Conta(89, "Joao");
        System.out.println("--objeto cc1--");
        cc1.info();
        // info(cc1);
        System.out.println("--objeto cc2--");
        cc2.info();

        cc1.titular = "Jose";
        cc1.saldo = 1000.0;
        cc1.limite = 2000.0;

        // cc2.titular = "Joao";
        cc2.saldo = 1350.0;
        cc2.limite = 3000.0;

        System.out.println("--objeto cc1--");
        cc1.info();
        System.out.println("--objeto cc2--");
        cc2.info();
    }
}
