import java.time.LocalDate;

public class EntregaAgendada extends ModalidadeEntrega {
    private LocalDate dataAgendada;
    protected EntregaAgendada(double distanciaKm, LocalDate data) {
        super(distanciaKm);
        this.dataAgendada = data;
    }

    @Override
    public String getNome() {
        return "Entrega Agendada";
    }

    @Override
    public double calcularFrete(double pesoKg) {
       return 32 + 1.20 * getDistanciaKm() + 2.50 * pesoKg;
    }
    
}
