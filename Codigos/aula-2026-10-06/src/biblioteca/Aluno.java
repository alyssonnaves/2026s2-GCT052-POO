package biblioteca;

class Aluno extends Usuario {
    private final String curso;

    public Aluno(String id, String nome, String email, String curso) {
        super(id, nome, email); // inicializa a parte " Usuario "
        if (curso == null || curso.isBlank())
            throw new IllegalArgumentException(" curso ");
        this.curso = curso;
        this.testeVisibilidade = 2;
    }

    public String getCurso() {
        return curso;
    }

    @Override   // que vou sobreescrever metodo da super classe
    public int limiteEmprestimos() {
        System.out.println(">>> metodo definido na Aluno");

        return 4; // mantém 4 (poderia ser diferente )
    }

    @Override
    public String toString() {
        return " Aluno { " + super.toString() + " , curso = " + curso + "}";
    }
}
