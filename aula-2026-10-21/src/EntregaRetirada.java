public class EntregaRetirada extends ModalidadeEntrega{

    public EntregaRetirada(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public double calcularFrete(double pesoKg) {
        return 1.99;
    }

    @Override
    public String getNome() {
        return "Retirada na loja";
    }   
}
