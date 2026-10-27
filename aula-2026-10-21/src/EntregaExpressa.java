public class EntregaExpressa extends ModalidadeEntrega{
    public EntregaExpressa(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public String getNome() {
        return "Entrega expressa";
    }

    @Override
    public double calcularFrete(double pesoKg) {
        validarPeso(pesoKg);
        return 16 + 1.20 * getDistanciaKm() + 2.50 * pesoKg;
    }
}
