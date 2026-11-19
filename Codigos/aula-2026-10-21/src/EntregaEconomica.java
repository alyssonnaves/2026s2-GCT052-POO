public class EntregaEconomica extends ModalidadeEntrega{

    public EntregaEconomica(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public String getNome() {
       return "Entrega Economica";
    }

    @Override
    public double calcularFrete(double pesoKg) {
        validarPeso(pesoKg);
        return 8 + 0.6 * getDistanciaKm() + 1.5 * pesoKg;
    }
    
}
