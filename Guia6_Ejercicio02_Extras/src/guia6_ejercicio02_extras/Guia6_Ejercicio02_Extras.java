//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
//en los atributos del objeto. Después, a través de otro método calcular y devolver la
//distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
//como calcular la distancia entre dos puntos consulte el siguiente link:
//http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

package guia6_ejercicio02_extras;

import Entidades.Puntos;
import Servicios.PuntosServicios;

/* @author Andrés Panella
 */
public class Guia6_Ejercicio02_Extras {

    public static void main(String[] args) {
    PuntosServicios pServ = new PuntosServicios();
    Puntos puntos = pServ.crearPuntos();
        System.out.println("La distancia entre P1 y P2 es: "+pServ.calculaDistancia(puntos));
    }

}
