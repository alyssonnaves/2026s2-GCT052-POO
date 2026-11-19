public class AppRetorno {
    public static void main(String[] args) {
        Conta cc1 = new Conta(123, "John Doe");
        cc1.depositar(5000);
        cc1.limite = 3000;

        boolean retorno = cc1.sacar(9000);
        if (retorno == true){
            System.out.println("OK, deu certo");
        }else{
            System.out.println("Falha no saque");
        }
           
    }
}
