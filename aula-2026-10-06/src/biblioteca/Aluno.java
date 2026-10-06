package biblioteca;

class Aluno extends Usuario {
    private final String curso;

    public Aluno(String id, String nome, String email, String curso) {
        super(id, nome, email); // inicializa a parte " Usuario "
        if (curso == null || curso.isBlank())
            throw new IllegalArgumentException(" curso ");
        this.curso = curso;
        
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public int limiteEmprestimos() {
        return 4; // mantém 4 (poderia ser diferente )
    }

    @Override
    public String toString() {
        return " Aluno { " + super.toString() + " , curso = " + curso + "}";
    }
}
