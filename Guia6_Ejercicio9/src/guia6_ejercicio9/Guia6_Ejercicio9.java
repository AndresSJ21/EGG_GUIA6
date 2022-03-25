//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. 
//La clase deber tener un constructor vacío, parametrizado y get y set. 
//En el main se creará el objeto y se usará el Math.random para generar los dos números
//y se guardaran en el objeto con su respectivos set. 

//Deberá además implementar los siguientes métodos:
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

package guia6_ejercicio9;

/* @author Andrés Panella
 */

import Entidades.Matematica;
import Servicios.MatematicaServicios;
import java.util.Scanner;
public class Guia6_Ejercicio9 {

    public static void main(String[] args) {
    
        Matematica m = new Matematica();
        MatematicaServicios ms = new MatematicaServicios();
        Scanner leer = new Scanner(System.in);
        int option;
        do {
        System.out.println("");
        System.out.println("Ingrese una opción\n"
                + "0_Salir\n"
                + "1_Generar 2 números reales aleatorios\n"
                + "2_Muestra el mayor de los 2 números\n"
                + "3_El mayor elevado al menor(previamente redondeados)\n"
                + "4_Raiz cuadrada del valor absoluto del menor");
        option=leer.nextInt();  
            switch (option) {
                case 0:
                    System.out.println("Gracias por participar!");
                    break;
                case 1:
                    m.setNum1(Math.random() * 9);
                    System.out.println(m.getNum1());
                    m.setNum2(Math.random() * 9);
                    System.out.println(m.getNum2());
                    break;
                case 2:
                    double mayor1 = ms.devolverMayor(m);
                    System.out.println("El mayor de los números generados es: " + mayor1);
                    break;
                case 3:
                    double potencia1 = ms.calcularPotencia(m);
                    System.out.println("La potencia del mayor elevado al menor es: " + potencia1);
                    break;
                case 4:
                    double raiz1 = ms.calculaRaiz(m);
                    System.out.println("La raiz cuadrada del menor de los números es: "+raiz1);
                    break;
                default:
                    System.out.println("Ha ingresado una opción incorrecta\n"
                            + "Vuelva a intentarlo");
                    break;
            }         
        }while (option!=0);
    }
}
