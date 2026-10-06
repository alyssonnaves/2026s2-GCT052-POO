package biblioteca;

public class Usuario {
    private final String id;
    private final String nome;
    private final String email;

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

    public int limiteEmprestimos() {
        return 3; // regra default ( pode ser sobrescrita )
    }

    @Override
    public String toString() {
        return "Usuario { id = " + id + " , nome = " + nome + " , email= " + email + " }";
    }
}
