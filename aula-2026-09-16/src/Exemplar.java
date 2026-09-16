public class Exemplar {
    private final String codigo;
    private final String titulo;
    private StatusExemplar status;

    public Exemplar(String codigo, String titulo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo invalido.");
        }
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Titulo invalido.");
        }
        this.codigo = codigo;
        this.titulo = titulo;
        this.status = StatusExemplar.DISPONIVEL;
    }
}