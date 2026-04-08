public class AviaoBoeing737Max extends Aviao{

    public AviaoBoeing737Max() {
        super("Boeing 737 Max", new CoPiloto(new Piloto(new TripulacaoBase())));
    }

}
