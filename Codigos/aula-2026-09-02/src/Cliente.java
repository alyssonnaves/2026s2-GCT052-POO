public class Cliente {
    String nome;
    String sobrenome;
    String documento;

    void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Documento: " + documento);
    }
    
    // sobreescrita do metodo
    public String toString(){
        return "Nome: " + nome +
               "\nSobrenome: " + sobrenome +
               "\nDocumento: " + documento;
    }
}
