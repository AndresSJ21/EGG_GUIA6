
package ServicioCafetera;

import Entidades.Cafetera;
import Entidades.Taza;
import java.util.Scanner;
/**
 * @author Andrés Panella
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    public Cafetera llenarCafetera(){
        Cafetera c1 = new Cafetera();
        c1.setCapacidadMaxima(1000.0);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        return c1;
    }
    
    
    public void servirTaza(Cafetera c1) {
        Taza t1 = new Taza();
        System.out.println("Ingrese capacidad de taza a llenar");
        t1.setCapacidadTaza(leer.nextDouble());
        if (t1.getCapacidadTaza() > c1.getCantidadActual()) {
            t1.setNivelActualTaza(c1.getCantidadActual());
            c1.setCantidadActual(0.0);
            System.out.println("La taza no se ha llenado 'PIJOTERO', queda con " + t1.getNivelActualTaza() + "ml");
            System.out.println("La cafetera quedó con " + c1.getCantidadActual() + "ml");
            System.out.println("");
        } else {
            t1.setNivelActualTaza(t1.getCapacidadTaza());
            c1.setCantidadActual(c1.getCantidadActual() - t1.getCapacidadTaza());
            System.out.println("La taza se ha llenado, no rompás más los huevos Juancho");
            System.out.println("La cafetera quedó con " + c1.getCantidadActual() + "ml");
            System.out.println("");
        }
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0.0);
        System.out.println("La cafetera quedó con " + c1.getCantidadActual() + "ml");
        System.out.println("");
    }
    
    public void agregarCafe(Cafetera c1){
        System.out.println("Indique cantidad de café a agregar");
        Double agregaCafe = leer.nextDouble();
        while (c1.getCapacidadMaxima()<(c1.getCantidadActual()+agregaCafe)){
            System.out.println("No es posible agregar esa cantidad, se va a rebalzar");
            System.out.println("Indique cantidad de café a agregar");
            agregaCafe = leer.nextDouble();
        }
        c1.setCantidadActual(c1.getCantidadActual()+agregaCafe);
        System.out.println("La cafetera quedó con " + c1.getCantidadActual() + "ml");
        System.out.println("");
    }

    public void estadoCafetera (Cafetera c1){
        System.out.println(c1);
    }
    
    
}
  
