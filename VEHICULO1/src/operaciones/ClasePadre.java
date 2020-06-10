
package operaciones;
import java.util.Scanner;
public class ClasePadre {
protected int llantas,puertas,numero_asientos,velocidad_maxima,peso;
protected double altura;
Scanner mc=new Scanner(System.in);
public void PedirDatos(){
System.out.println("EL SIGUIENTE PROGRAMA IDENTIFICARA QUE TIPO DE VEHICULO ES");
System.out.println("INGRESE EL NUMERO DE LLANTAS");
llantas=mc.nextInt();
System.out.println("INGRESE EL NUMERO DE PUERTAS");
puertas=mc.nextInt();
System.out.println("INGRESE EL NUMERO DE ASIENTOS");
numero_asientos=mc.nextInt();
System.out.println("INGRESE LA VELOCIDAD MAXIMA");
velocidad_maxima=mc.nextInt();
System.out.println("INGRESE LA ALTURA");
altura=mc.nextDouble();  
System.out.println("INGRESE EL PESO");
peso=mc.nextInt();  

}
}
