public class Conta {
    // atributos - caracteristicas
    int numero;
    String titular;
    double saldo;
    double limite;

    // construtor
    public Conta(int numero){
        this.numero = numero;
    }

    public Conta(int num, String tit){
        this.numero = num;
        titular = tit;
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

    public void depositar(double valor){
        if (valor>0){ 
            this.saldo = this.saldo + valor;
            System.out.println("Deposito realizado com sucesso");
        }        
    }

    public boolean sacar(double valor){
        if ((valor>0) && (valor <= this.saldo + this.limite)){
            this.saldo = this.saldo - valor;
            // System.out.println("Saque realizado com sucesso");
            return true;
        } else if (valor <= 0){
            // System.out.println("Valor de saque invalido");
            return false;
        } else {
            // System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
