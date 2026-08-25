public class Conta {
    // atributos - caracteristicas
    int numero;
    String titular;
    double saldo;
    double limite;

    // construtor
    public Conta(int num){
        numero = num;
    }
    // metodo = funcao pra exibir os dados
    /**
     * Metodo que exibe as informacoes da conta
     */
    public void info(){
        System.out.println("Numero: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
    }
}
