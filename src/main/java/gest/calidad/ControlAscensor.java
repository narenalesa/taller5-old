package gest.calidad;

import java.util.Random;

public class ControlAscensor {

private final int PISOSMAX = 3;
private final int PISOSMIN = 3;
 
    public void crearPersona () {
         
        Random o = new Random();
        Random d = new Random();
                
        int origen = o.nextInt(PISOSMAX - PISOSMIN + 1 ) + PISOSMIN;
        int destino = d.nextInt(PISOSMAX - PISOSMIN + 1 ) + PISOSMIN;
        /*
        while (origen == destino){
            destino = d.nextInt(PISOSMAX - PISOSMIN + 1 ) + PISOSMIN;
        }*/
        
        System.out.println("Piso origen: "+origen+" piso detino: "+destino );
    
    }
    
}
