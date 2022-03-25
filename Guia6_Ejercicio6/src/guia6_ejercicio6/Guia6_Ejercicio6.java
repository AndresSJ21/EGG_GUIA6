//Programa Nespresso. Desarrolle una clase Cafetera con los atributos
//capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
//menos, los siguientes métodos:
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.

package guia6_ejercicio6;

import Entidades.Cafetera;
//import Entidades.Taza;
import ServicioCafetera.CafeteraServicio;
import java.util.Scanner;
/* @author Andrés Panella
 */
public class Guia6_Ejercicio6 {

    public static void main(String[] args) {
    CafeteraServicio cs = new CafeteraServicio();
    
    Cafetera c1 = cs.llenarCafetera();
    Scanner leer = new Scanner(System.in);
    System.out.println(c1);
    
 
    cs.llenarCafetera();
    int option = 0;
   
        do {
            System.out.println("Ingrese opción");
            System.out.println("1 - Servir Taza");
            System.out.println("2 - Vaciar Cafetera");
            System.out.println("3 - Agregar Café");
            System.out.println("4 - Estado Cafetera");
            System.out.println("5 - Salir");
            option = leer.nextInt();
            switch (option) {

                case 1:
                    cs.servirTaza(c1);
                    break;
                case 2:
                    cs.vaciarCafetera(c1);
                    break;
                case 3:
                    cs.agregarCafe(c1);
                    break;
                case 4:
                    cs.estadoCafetera(c1);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("El numero ingresado no es válido");

            }

        } while (option != 5);

    }

}
