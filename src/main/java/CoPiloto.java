public class CoPiloto extends TripulacaoDecorator{

                    public CoPiloto(Tripulacao tripulacao) {
        super(tripulacao);
    }

    @Override
    public String getTipoTripulacao() {
        return "Co-Piloto";
    }
}
