import java.time.LocalDate;

public class AppCheckout {
    public static void main(String[] args) {
        MeioPagamento pagamento = new PagamentoValePresente(1000);
        ModalidadeEntrega entrega = new EntregaAgendada(250, LocalDate.now());
        Checkout venda = new Checkout(pagamento);
        venda.concluir(300, 5, entrega);
    }
}
