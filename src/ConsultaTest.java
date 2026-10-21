import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class ConsultaTest {




    @Test 

    public void TestaValorDaConsultaAgendada(){
        ConsultaAgendada teste = new ConsultaAgendada("Roberto", LocalDateTime.now(), EEspecialidade.DERMATOLOGIA);
        
        assertEquals(200.00, teste.valorConsulta(), .01);
    }

    @Test 

    public void TestaValorDaConsultaAgendadaComAntecedencia(){
        LocalDateTime dias = LocalDateTime.now().plusDays(30);
        ConsultaAgendada teste = new ConsultaAgendada("Roberto", dias, EEspecialidade.DERMATOLOGIA);
        
        assertEquals(140.00, teste.valorConsulta(), .01);
    }


    
}
