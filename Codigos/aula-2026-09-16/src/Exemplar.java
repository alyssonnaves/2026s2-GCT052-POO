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

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public boolean isDisponivel() {
        return status == StatusExemplar.DISPONIVEL;
    }

    public void emprestar() {
        if (status == StatusExemplar.EMPRESTADO) {
            throw new IllegalStateException("Exemplar ja emprestado.");
        }
        if (status == StatusExemplar.BLOQUEADO) {
            throw new IllegalStateException("Exemplar bloqueado.");
        }
        status = StatusExemplar.EMPRESTADO;
    }

    public void devolver() {
        if (status != StatusExemplar.EMPRESTADO) {
            throw new IllegalStateException("Exemplar nao esta emprestado.");
        }
        if (status == StatusExemplar.BLOQUEADO) {
            throw new IllegalStateException("Exemplar bloqueado.");
        }
        status = StatusExemplar.DISPONIVEL;
    }

    public void bloquear() {
        if (status == StatusExemplar.EMPRESTADO) {
            throw new IllegalStateException("Nao bloqueie exemplar emprestado.");
        }
        status = StatusExemplar.BLOQUEADO;
    }

    public void desbloquear() {
        if (status != StatusExemplar.BLOQUEADO) {
            throw new IllegalStateException("Exemplar nao esta bloqueado.");
        }
        status = StatusExemplar.DISPONIVEL;
    }
}