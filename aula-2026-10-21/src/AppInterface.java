public class AppInterface {
    public static void main(String[] args) {
        MeioPagamento meio = new PagamentoPix(500.0);
        System.out.println(meio.getNome());
        System.out.println(meio.autorizar(200.0));
        meio = new PagamentoCartao(300.0, 2);
        System.out.println(meio.getNome());
        System.out.println(meio.autorizar(200.0));
    }
}
