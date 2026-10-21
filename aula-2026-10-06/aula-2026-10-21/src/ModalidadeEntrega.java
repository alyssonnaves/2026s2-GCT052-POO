public abstract class ModalidadeEntrega {
    private final double distanciaKm;

    protected ModalidadeEntrega(double distanciaKm) {
        if (!Double.isFinite(distanciaKm) || distanciaKm <= 0) {
            throw new IllegalArgumentException("Distancia invalida");
        }
        this.distanciaKm = distanciaKm;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    protected void validarPeso(double pesoKg){
        if (!Double.isFinite(pesoKg) || pesoKg <= 0){
            throw new IllegalArgumentException("Peso invalido");
        }
    }

    // nao sao implementados aqui, somente nas classes filhas
    public abstract String getNome();
    public abstract double calcularFrete(double pesoKg);

    public String resumo(double pesoKg){
        String valorFormatado = String.format(java.util.Locale.forLanguageTag("pt-BR"), "%.2f", calcularFrete(pesoKg));
        
        return getNome() + ": R$ " + valorFormatado;
    }
}