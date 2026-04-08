import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAviaoCessna208Caravan {
    @Test
    public void testCessna208CaravanObterModelo(){
        Aviao aviao = new AviaoCessna208Caravan();
        assertEquals("Cessna 208 Caravan",aviao.getModelo());
    }

    @Test
    public void testCessna208CaravanObterTripulacao(){
        Aviao aviao = new AviaoCessna208Caravan();
        assertEquals("Tripulação: Piloto",aviao.getComposicaoDaTripulacao());
    }
}
