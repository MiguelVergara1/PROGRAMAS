
package operaciones;

public class MOTOCICLETA extends ClasePadre{
public void cola(){
    if(llantas==2 && puertas==0 && numero_asientos==2){
    System.out.println(" UNA MOTO");
    }
    if(llantas==4 && puertas==3 && numero_asientos==5){
    System.out.println(" CARRO DE 3 PUERTAS");
    }
    if(llantas==4 && puertas==5 && numero_asientos==5){
    System.out.println(" CARRO DE 5 PUERTAS");
    }
    if(llantas==0 && puertas==puertas && numero_asientos>=2&&numero_asientos<=10){
    System.out.println("UN BARCO");
    }
    if(llantas>=15&&llantas<=25 && puertas==2 && numero_asientos==2){
        System.out.println("UN CAMION");}
    if(llantas>=4&&llantas>=8 && puertas==3 && numero_asientos==2 && peso==peso){
        System.out.println("UNA FURGONETA");
    }
    if(llantas>=4&&llantas>=26&&puertas==2&&numero_asientos>=30 && numero_asientos<=45){
       System.out.println("UN AUTOBUS"); 
    }
    if(numero_asientos==45-235){
        System.out.println("UNA AVION");    
    }
    if(llantas==2 && puertas==0 && numero_asientos==1&&altura==altura)
    {
        System.out.println("UN TRACCION ANIMAL");
    }
    if(llantas==3){
        System.out.println("UN TRACTOR");
    }
    if(llantas>=50 && llantas<=120){
        System.out.println("UN TREN");
    }
}}
