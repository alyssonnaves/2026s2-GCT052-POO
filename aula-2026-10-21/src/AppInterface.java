public class AppInterface {

    public static void venda(MeioPagamento meio, double valor){
        if (meio.autorizar(valor)){
            System.out.println("Pagamento via "+ meio.getNome() +" realizado com sucesso");
        }else{
            System.out.println("Pagamento via "+ meio.getNome() +" falhou");
        }
    }
    public static void main(String[] args) {
        // MeioPagamento meio = new PagamentoPix(500.0);
        // MeioPagamento meio = new PagamentoCartao(300.0, 2);
        MeioPagamento meio = new PagamentoDinheiro();
        venda(meio, 1000);

        
        
    }
}
