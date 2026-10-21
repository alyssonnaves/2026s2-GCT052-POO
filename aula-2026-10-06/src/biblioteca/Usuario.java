package biblioteca;

public abstract class Usuario {
    private final String id;
    private final String nome;
    private final String email;
    protected  int testeVisibilidade;

    public Usuario(String id, String nome, String email) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException(" id ");
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException(" nome ");
        if (email == null || email.isBlank())
            throw new IllegalArgumentException(" email ");
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.testeVisibilidade = 2;

    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract int limiteEmprestimos();

    @Override
    public String toString() {
        return "Usuario { id = " + id + " , nome = " + nome + " , email= " + email + ", limite " + limiteEmprestimos() +" }";
    }
}
