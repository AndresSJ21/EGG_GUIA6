
package Servicios;
import Entidades.Puntos;
import java.util.Scanner;
/**
 * @author Andrés Panella
 */
public class PuntosServicios {
    public Puntos crearPuntos(){
    Puntos puntos = new Puntos();
    Scanner leer = new Scanner(System.in);   
        System.out.println("Ingrese coordenadas del punto P1");
        System.out.println("   x:");
        double x1=leer.nextDouble();
         System.out.println("   y:");
        double y1=leer.nextDouble();
         System.out.println("Ingrese coordenadas del punto P2");
        System.out.println("   x:");
        double x2=leer.nextDouble();
         System.out.println("   y:");
        double y2=leer.nextDouble();
        puntos.setP1(x1, y1);
        puntos.setP2(x2, y2);
        
        System.out.println(puntos.toString());
    return puntos;
    }
    
    public double calculaDistancia (Puntos puntos){
        double x1=puntos.getP1()[0];
        double y1=puntos.getP1()[1];
        double x2=puntos.getP2()[0];
        double y2=puntos.getP2()[1];
        double distancia=Math.sqrt(Math.pow(Math.abs(x2-x1), 2.0)+Math.pow(Math.abs(y2-y1), 2.0));
        
        return distancia;
    }
}
