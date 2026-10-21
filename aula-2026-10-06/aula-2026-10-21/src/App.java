public class App {
    public static void main(String[] args) throws Exception {
        ModalidadeEntrega entrega = new EntregaEconomica(10);
        System.out.println(entrega.resumo(2));

        entrega = new EntregaExpressa(10);
        System.out.println(entrega.resumo(2));

        
    }
}
