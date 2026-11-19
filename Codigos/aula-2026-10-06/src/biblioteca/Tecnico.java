package biblioteca;

public class Tecnico extends Usuario{
    private String cargo;

    public Tecnico(String id, String nome, String email, String cargo) {
        super(id, nome, email);
        this.cargo = cargo;
    }

    @Override
    public int limiteEmprestimos() {
        return 5;
    }
    
    
}
