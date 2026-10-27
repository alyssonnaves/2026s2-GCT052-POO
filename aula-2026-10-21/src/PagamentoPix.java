public class PagamentoPix implements MeioPagamento {
    // PagamentoPix assume a responsabilidade de implementar os metodos da interface
    // - assina um contrato
    private double saldoDisponivel;

    public PagamentoPix(double saldoInicial) {
        if (!Double.isFinite(saldoInicial) || saldoInicial < 0) {
            throw new IllegalArgumentException("saldo inicial invalido");
        }
        this.saldoDisponivel = saldoInicial;
    }

    @Override
    public String getNome() {
        return "PIX";
    }

    @Override
    public boolean autorizar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0)
            throw new IllegalArgumentException("Valor invalido");
        if (valor > saldoDisponivel)
            return false;
        saldoDisponivel -= valor;
        return true;
    }

}
