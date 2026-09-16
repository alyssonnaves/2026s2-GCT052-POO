public class Conta {
    private double saldo;
    private double limite;

    // construtor
    public Conta(double limite){
        if (limite < 0){
            limite = 0;  // regra - se valor negativo, usa valor padrao 0
        }
        this.limite = limite;
    }

    // metodo
    public boolean depositar(double valor){
        if (valor <= 0){
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo + this.limite){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }

    public String extrato(){
        String saida =  "----EXTRATO----\n" +
                        "Saldo: R$ " + this.saldo +
                        "\nLimite: R$ " + this.limite +
                        "\n---------------\n"+
                        "Disponivel: R$ " + (saldo+limite);
        return saida;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    


}
