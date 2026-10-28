public class Checkout {

    private final MeioPagamento pagamento;

    public Checkout(MeioPagamento pagamento) {
        if (pagamento == null)
            throw new IllegalArgumentException("Pagamento nulo");
        this.pagamento = pagamento;
    }

    public boolean concluir(double subtotal, double pesoKg,
            ModalidadeEntrega entrega) {
        if (!Double.isFinite(subtotal) || subtotal <= 0 || entrega == null)
            throw new IllegalArgumentException("Compra invalida");
        double frete = entrega.calcularFrete(pesoKg);
        double total = subtotal + frete;
        System.out.printf("Frete: R$ %.2f%n", frete);
        System.out.printf("Total: R$ %.2f%n", total);
        boolean aprovado = pagamento.autorizar(total);
        System.out.println(aprovado ? "Aprovado" : "Recusado");
        return aprovado;
    }

}
