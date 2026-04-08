import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMcDonnellDouglasMD88 {
    @Test
    public void testMcDonnellDouglasMD88ObterModelo(){
        Aviao aviao = new AviaoMcDonnellDouglasMD88();
        assertEquals("McDonnell Douglas MD88",aviao.getModelo());
    }

    @Test
    public void testMcDonnellDouglasMD88ObterTripulacao(){
        Aviao aviao = new AviaoMcDonnellDouglasMD88();
        assertEquals("Tripulação: Piloto/Co-Piloto/Engenheiro de Voo",aviao.getComposicaoDaTripulacao());
    }
}
