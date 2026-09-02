public class Conta { 
    int numero;
    double saldo;
    double limite;
    Cliente titular;

    void info(){
        System.out.println("Numero " + numero);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
        System.out.println("Titular: " + titular);
        titular.info();
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", titular=" + titular + "]";
    }

    
}