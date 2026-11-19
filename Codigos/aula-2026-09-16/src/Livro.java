import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String isbn;
    private String titulo;
    // Estrutura de dados 
    private List<Exemplar> exemplares = new ArrayList<Exemplar>();
    // construtor
    public Livro(String isbn, String titulo){
        if (isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("isbn deve preenchido");
        }
        if (titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("titulo deve preenchido");
        }
        this.isbn = isbn;
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public void adicionarExemplar(Exemplar exemplar){
        if (exemplar == null){
            throw new IllegalArgumentException("Exemplar null -  ajustar");
        }
        if (existeExemplarComCodigo(exemplar)){
            throw new IllegalArgumentException("Codigo de exemplar duplicado");
        }
        exemplares.add(exemplar);
    }

    private boolean existeExemplarComCodigo(Exemplar exemplar){
        // percorrer a lista de exemplares
        for (Exemplar exCadastrado : exemplares) {
            if (exemplar.getCodigo().equals(exCadastrado.getCodigo())){
                return true;
            }
        }
        return false;
    }
    public List<Exemplar> getExemplares(){
        return List.copyOf(exemplares); // proteger o encapsulamento
    }

    public void relatorioExemplares(){
        System.out.println("---------------------------------");
        System.out.println("TITULO: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Codigo\t|\tTitulo\t\t\t|\tStatus\t\t|\tDisponivel");
        for (int i = 0; i < exemplares.size(); i++) {
            Exemplar obj = exemplares.get(i);
            System.out.print(obj.getCodigo());
            System.out.print("\t|\t");
            System.out.print(obj.getTitulo());
            System.out.print("\t|\t");
            System.out.print(obj.getStatus());
            System.out.print("\t|\t");
            System.out.println(obj.isDisponivel()); // pra quebrar linha
        }
    }
}
