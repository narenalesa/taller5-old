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
    }
    

    @Test
    public void crearPersonaEnPisoAlAzar (){
    
    //logica de la prueba
    
    //verificacion o assert
    controlAscensor.crearPersona();
    
    }
}
