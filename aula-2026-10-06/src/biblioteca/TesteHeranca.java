package biblioteca;

public class TesteHeranca {
    public static void main(String[] args) {
        System.out.println("=== Criando um Usuario comum ===");

        Usuario usuario = new Usuario(
            "U001",
            "Carlos Silva",
            "carlos@cidade.br"
        );

        System.out.println(usuario);
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Limite: " + usuario.limiteEmprestimos());

        System.out.println();

        System.out.println("=== Criando um Aluno ===");
        Aluno aluno = new Aluno(
            "A001",
            "Ana Souza",
            "ana@ufla.br",
            "Sistemas de Informação"
        );
        System.out.println(aluno);

        // Métodos herdados de Usuario
        System.out.println("ID: " + aluno.getId());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());

        // Método específico de Aluno
        System.out.println("Curso: " + aluno.getCurso());

        // Método sobrescrito em Aluno
        System.out.println("Limite: " + aluno.limiteEmprestimos());
        System.out.println();


        
        // System.out.println("=== Aluno tratado como Usuario ===");

        // Usuario usuario2 = aluno;

        // System.out.println(usuario2);
        // System.out.println("Nome: " + usuario2.getNome());
        // System.out.println("Limite: " + usuario2.limiteEmprestimos());

        // System.out.println();
        // System.out.println("Classe real do objeto: " + usuario2.getClass().getSimpleName());
        // System.out.println("usuario2 instanceof Usuario? " + (usuario2 instanceof Usuario));
        // System.out.println("usuario2 instanceof Aluno? " + (usuario2 instanceof Aluno));

        // System.out.println();
        // System.out.println("=== Testando validacoes herdadas ===");

        // try {
        //     Aluno alunoInvalido = new Aluno(
        //         "",
        //         "Joao",
        //         "joao@ufla.br",
        //         "Computacao"
        //     );

        //     System.out.println(alunoInvalido);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Erro ao criar aluno: " + e.getMessage());
        // }

        // System.out.println();
        // System.out.println("=== Testando validacao especifica de Aluno ===");

        // try {
        //     Aluno alunoSemCurso = new Aluno(
        //         "A002",
        //         "Maria",
        //         "maria@ufla.br",
        //         ""
        //     );

        //     System.out.println(alunoSemCurso);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Erro ao criar aluno: " + e.getMessage());
        // }
    }
}
