public class PagamentoDinheiro implements MeioPagamento {

    @Override
    public String getNome() {
        return "Dinheiro";
    }

    @Override
    public boolean autorizar(double valor) {
        if (valor<0){
            throw new IllegalArgumentException("Valor invalido");
        }
        return true;
    }
    
}
