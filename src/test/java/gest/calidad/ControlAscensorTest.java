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
    public void ascensorSoloTransporta1Persona () throws Exception{
        
        exception.expect(Exception.class);
        controlAscensor.verificarPersonas(2);
        
        
    }

      
    @Test
    public void pisoOrigenNoEsIgualAPisoDestino () throws Exception{
        
        
        exception.expect(Exception.class);
        controlAscensor.verificarDestino(1);
                        
        
    }
    
    @Test
    public void siPrimeraPersonaEnPiso1 () throws Exception{
            
        assertEquals("puede subir de inmediato", controlAscensor.llamadaAscensor(1,1));
        assertEquals("ascensor esta subiendo a su piso", controlAscensor.llamadaAscensor(2,1));
        assertEquals("ascensor esta subiendo a su piso", controlAscensor.llamadaAscensor(3,1));
        
    }
    
    @Test
    public void siPrimeroSubeLuegoBaja ()throws Exception{
        
        assertEquals("El ascensor sube", controlAscensor.direccionAscensor(3));
        assertEquals("El ascensor baja", controlAscensor.direccionAscensor(1));
        assertEquals("El ascensor sube", controlAscensor.direccionAscensor(2));
        
        
    }
    
    
}
