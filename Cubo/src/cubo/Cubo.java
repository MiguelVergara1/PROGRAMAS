package cubo;
import java.util.Scanner;
public class Cubo {

    
    public static void main(String[] args) {
    Scanner mc=new Scanner(System.in);
    System.out.println("El Programa Nos Dice Si Es Un Numero Cubo");
    Double indice=3.0,radicando;
    System.out.println("Ingrese El Numero");
    radicando=mc.nextDouble();
    float resultado=(float)Math.pow(radicando,1/indice);
    if(Math.pow(resultado,3)==radicando){
    System.out.println("El Numero Es Un Cubo");
    }
    else {
    System.out.println("El Numero No Es Un Cubo");
    }
    }
    
}
