import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteTripulacao {

    @Test
    public void testTripulacaoComPiloto(){
        Tripulacao tripulacao = new Piloto(new TripulacaoBase());
        assertEquals("Tripulação: Piloto",tripulacao.getComposicaoDaTripulacao());
    }

    @Test
    public void testTripulacaoComPilotoECopiloto(){
        Tripulacao tripulacao = new CoPiloto(new Piloto(new TripulacaoBase()));
        assertEquals("Tripulação: Piloto/Co-Piloto",tripulacao.getComposicaoDaTripulacao());
    }

    @Test
    public void testTripulacaoComPilotoECopilotoEEngenheiroDeVoo(){
        Tripulacao tripulacao = new EngenheiroVoo(new CoPiloto(new Piloto(new TripulacaoBase())));
        assertEquals("Tripulação: Piloto/Co-Piloto/Engenheiro de Voo",tripulacao.getComposicaoDaTripulacao());
    }
    @Test
    public void testTripulacaoComPilotoEEngenheiroDeVoo(){
        Tripulacao tripulacao = new EngenheiroVoo(new Piloto(new TripulacaoBase()));
        assertEquals("Tripulação: Piloto/Engenheiro de Voo",tripulacao.getComposicaoDaTripulacao());
        
    }
}
