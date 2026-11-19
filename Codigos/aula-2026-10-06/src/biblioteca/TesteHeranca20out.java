package biblioteca;

public class TesteHeranca20out {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("111","AAA", "a@a.com.br", "Eng. Software");
        // int limite = aluno.limiteEmprestimos();
        // System.out.println("LIMITE " + limite);

        Professor professor = new Professor("123", "PrB", "prb@a.com", "Software");       
        System.out.println(professor); 

        System.out.println(aluno);
    }   
}
