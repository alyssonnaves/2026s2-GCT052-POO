public class PagamentoValePresente implements MeioPagamento {
    private double saldo;
    public PagamentoValePresente(double saldo) {
        if (!Double.isFinite(saldo) || saldo < 0){
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldo = saldo;
    }
    @Override
    public String getNome() {
       return "Vale Presente";
    }

    @Override
    public boolean autorizar(double valor) {
        if (!Double.isFinite(valor) || valor<0){
            throw new IllegalArgumentException("valor invalido");
        }
        if (valor <= saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
}
