public class Classe {
    // atributo da classe
    public static int compartilhado=0;
    // atributos do objeto
    public int numero;
    public int numeroIncremento;

    public Classe(){
        numero = 3;
        // pega uma copia do valor de compartilhado
        numeroIncremento = ++compartilhado; 
        
    }

    public void info(){
        System.out.println("-----------------");
        System.out.println("numero " + numero);
        System.out.println("numeroIncremento " + numeroIncremento);
    }

    public static void main(String[] args) {
        Classe obj1 = new Classe();
        Classe obj2 = new Classe();
        Classe obj3 = new Classe();
        obj1.info();
        obj2.info();
        obj3.info();
    }
}
