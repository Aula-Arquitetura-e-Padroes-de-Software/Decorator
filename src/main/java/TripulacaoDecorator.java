public abstract class TripulacaoDecorator implements Tripulacao{

    private Tripulacao tripulacao;

    public TripulacaoDecorator(Tripulacao tripulacao) {
        this.tripulacao = tripulacao;
    }


    public abstract String getTipoTripulacao();

    @Override
    public String getComposicaoDaTripulacao() {
        String base = this.tripulacao.getComposicaoDaTripulacao();
        return base.isEmpty() ? "Tripulação: " + this.getTipoTripulacao() : base + "/" + this.getTipoTripulacao();
    }
}
