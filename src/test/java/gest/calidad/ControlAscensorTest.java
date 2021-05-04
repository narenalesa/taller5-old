package gest.calidad;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class ControlAscensorTest {

    private ControlAscensor controlAscensor; 
           
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void before(){
        controlAscensor = new ControlAscensor();
        controlAscensor.crearPersona();
        controlAscensor.posicionarAscensor();
    }
    

      
    @Test
    public void pisoOrigenNoEsIgualAPisoDestino () throws Exception{
        
        
        exception.expect(Exception.class);
        controlAscensor.verificarDestino(1);
        //assertEquals("Destino igual a origen: 1,1",controlAscensor.verificarDestino(1) );
        //assertEquals("verificado",controlAscensor.verificarDestino(2) );
                
    }
    
    @Test
    public void siPrimeraPersonaEnPiso1 () {
            
        assertEquals("puede subir de inmediato", controlAscensor.llamadaAscensor(1));
        assertEquals("ascensor esta subiendo a su piso", controlAscensor.llamadaAscensor(2));
        assertEquals("ascensor esta subiendo a su piso", controlAscensor.llamadaAscensor(3));
        
    }
}
