public class EngenheiroVoo extends TripulacaoDecorator{

    public EngenheiroVoo(Tripulacao tripulacao) {
        super(tripulacao);
    }

    @Override
    public String getTipoTripulacao() {
        return "Engenheiro de Voo";
    }
}
