import java.util.List;

public class AppLivroErro {
    public static void main(String[] args) {
        Livro liv = new Livro("2853-6874", "POO - Aprendendo");
        Exemplar ex1 = new Exemplar("283", liv.getTitulo());
        Exemplar ex2 = new Exemplar("288", liv.getTitulo());
        liv.adicionarExemplar(ex1);
        liv.adicionarExemplar(ex2);
        liv.relatorioExemplares();
        System.out.println("Quebrando o encapsulamento");
        List<Exemplar> lista = liv.getExemplares();
        // lista.clear(); // limpa a lista
        // Exemplar exEstranho = new Exemplar("9999", "Turma da Monica");
        // lista.add(exEstranho);
        liv.relatorioExemplares();
        
    }
}
