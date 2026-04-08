import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAviaoBoeing737Max {

    @Test
    public void testBoeing737MaxObterModelo(){
        Aviao aviao = new AviaoBoeing737Max();
        assertEquals("Boeing 737 Max",aviao.getModelo());
    }

    @Test
    public void testBoeing737MaxObterTripulacao(){
        Aviao aviao = new AviaoBoeing737Max();
        assertEquals("Tripulação: Piloto/Co-Piloto",aviao.getComposicaoDaTripulacao());
    }
}
