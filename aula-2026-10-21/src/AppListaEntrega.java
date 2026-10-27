import java.util.LinkedList;

public class AppListaEntrega {
    public static void main(String[] args) {
        // Criar uma lista dinamica - ED
        LinkedList<ModalidadeEntrega> lista = new LinkedList<>();
        double km = 10; 
        double peso = 5;
        lista.add(new EntregaEconomica(km));
        lista.add(new EntregaExpressa(km));
        lista.add(new EntregaEconomica(km));
        lista.add(new EntregaRetirada(km));

        for (ModalidadeEntrega entrega : lista) {
            System.out.println(entrega.resumo(peso));
        }
    }
}
