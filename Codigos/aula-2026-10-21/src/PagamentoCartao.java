public class PagamentoCartao implements MeioPagamento {
    private double limiteDisponivel;
    private final int parcelas;

    public PagamentoCartao(double limite, int parcelas) {
        if (!Double.isFinite(limite) || limite < 0 ||
                parcelas < 1 || parcelas > 12)
            throw new IllegalArgumentException("Dados invalidos");
        this.limiteDisponivel = limite;
        this.parcelas = parcelas;
    }

    @Override
    public String getNome() {
        return "Cartao (" + parcelas + "x)";
    }

    @Override
    public boolean autorizar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0)
            throw new IllegalArgumentException("Valor invalido");
        if (valor > limiteDisponivel) {
            return false;
        }
        // Nesta simulacao, o limite total e comprometido.
        limiteDisponivel -= valor;
        return true;
    }
}
