public class AviaoMcDonnellDouglasMD88 extends Aviao{
    public AviaoMcDonnellDouglasMD88() {
        super("McDonnell Douglas MD88 ", new EngenheiroVoo(new CoPiloto(new Piloto(new TripulacaoBase()))));
    }
}
