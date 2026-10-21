package biblioteca;

public class TestePolimorfismo {
    public static void imprimirLimite(Usuario u){
        int limite = u.limiteEmprestimos();
        System.out.println("limite de emprestimos = " + limite);
    }


    public static void main(String[] args) {
        // Usuario obj1 = new Usuario("1","A","a@a");
        Professor obj2 = new Professor("2", "P1", "p1@", "Software");
        Aluno obj3 = new Aluno("3","A1","a@a","BICT");
        Usuario obj4 = new Tecnico("4","T1","t@","secretaria");
        
        imprimirLimite(obj2);
    }
}
