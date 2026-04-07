public class Piloto extends TripulacaoDecorator{

    public Piloto(Tripulacao tripulacao) {
        super(tripulacao);
    }

    @Override
    public String getTipoTripulacao() {
        return "Piloto";
    }
}
