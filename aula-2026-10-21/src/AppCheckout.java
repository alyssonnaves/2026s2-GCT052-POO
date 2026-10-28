public class AppCheckout {
    public static void main(String[] args) {
        MeioPagamento pagamento = new PagamentoCartao(1000,5);
        ModalidadeEntrega entrega = new EntregaRetirada(250);
        Checkout venda = new Checkout(pagamento);
        venda.concluir(300, 5, entrega);
    }
}
