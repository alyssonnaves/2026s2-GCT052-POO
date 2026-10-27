public interface MeioPagamento {
    // TODOS OS METODOS SAO ABSTRADOS
    public String getNome();
    public boolean autorizar(double valor);
}
