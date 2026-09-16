package modelos;

public class Conta {
    // atributo da classe
    private static int totalContas = 0;
    // constante
    public static final String AGENCIA = "254-6";
    private int numero;
    private double saldo;
    private double limite;

    // construtor
    public Conta(double saldo, double limite){
        this.numero =  totalContas;
        totalContas++;
        this.saldo = saldo;
        this.limite = limite;
        
        // AGENCIA = "652-8"; // erro por ser constante
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
    }

    public static int getTotalContas(){
        return totalContas;
    }

    

}