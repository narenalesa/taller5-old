package gest.calidad;

import java.util.Random;

public class ControlAscensor {

private final int PISOSMAX = 3;
private final int PISOSMIN = 1;
private int origen;
private int pisoOrigen;
private boolean  estado;
 
    public void crearPersona () {
         
        Random o = new Random();                        
        origen = o.nextInt(PISOSMAX - PISOSMIN + 1 ) + PISOSMIN;
                
        System.out.println("Piso origen: "+origen);
    
    }
    
    public void posicionarAscensor(){
        pisoOrigen = 1;
        estado = false; //true = abierto
    }
    
     
    public void verificarDestino(int destino)throws Exception{
        if (origen == destino){
            System.out.println("destino igual a origen:"+origen+","+destino);
            throw new Exception ("Destino igual a origen: "+origen+","+destino);
        }else{
            System.out.println("destino diferente a origen:"+origen+","+destino);
            throw new Exception ("Verificado");
        }
        
        
    }
    
    public String llamadaAscensor(int llamada){
        
        if (pisoOrigen == llamada) {
            estado = true;
            return "puede subir de inmediato";
        }else {
            pisoOrigen = llamada;
            return "ascensor esta subiendo a su piso";
        }
        
    }
    
}
