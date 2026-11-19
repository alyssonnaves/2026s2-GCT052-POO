public class AppClasseGenerica {
    public static void main(String[] args) {
        ClasseGenerica<Produto> objetoGenerico = new ClasseGenerica<>();
        
        for (int i = 0; i < 5; i++) {
            Produto obj = new Produto("SKU-"+(i+1), "Nome produto " + (i+1), "Descricao " + (i+1));
            objetoGenerico.adicionar(obj);
            
        }

        objetoGenerico.imprimir();

        ClasseGenerica<String> outroGenerico = new ClasseGenerica<>();
        for (int i = 0; i < 5; i++) {
            outroGenerico.adicionar("TEXTO " + (i+1));
        }
        outroGenerico.imprimir();
        
    }
}
