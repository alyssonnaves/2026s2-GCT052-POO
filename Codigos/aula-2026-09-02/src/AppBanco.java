public class AppBanco {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.nome = "John";
        cli.sobrenome = "Doe";
        cli.documento = "123";

        Conta cc =  new Conta();
        cc.numero = 23;
        cc.saldo = 2000;
        cc.limite = 1000;
        cc.titular = cli;

        cc.info();
      
        Cliente outro = new Cliente();
        outro.nome = "Fulano";
        outro.sobrenome = "de Tal";
        outro.documento = "112358";

        Conta outraCC = new Conta();
        outraCC.numero = 67;
        outraCC.saldo = 5000;
        outraCC.limite = 2000;
        outraCC.titular = outro;

        outraCC.info();
    }
}
