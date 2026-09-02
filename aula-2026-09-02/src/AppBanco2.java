import javax.swing.JOptionPane;

public class AppBanco2 {
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
        
        // System.out.println(cli);
        System.out.println(cc);

        // System.out.println(cli.toString());
        // JOptionPane.showMessageDialog(null, cli);
    }
}
