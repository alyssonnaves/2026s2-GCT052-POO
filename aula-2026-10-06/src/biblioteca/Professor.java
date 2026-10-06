package biblioteca;

class Professor extends Usuario {
    private final String departamento;

    public Professor(String id, String nome, String email,
            String departamento) {
        super(id, nome, email);
        if (departamento == null || departamento.isBlank())
            throw new IllegalArgumentException(" departamento ");
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public int limiteEmprestimos() {
        return 5; // regra diferente para professor
    }

    @Override
    public String toString() {
        return " Professor { " + super.toString() + " , dep = " +
                departamento + " } ";
    }
}
