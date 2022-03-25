
package guia6_extras_ejercicio05;

import Entidades.Mes;
import java.util.Scanner;



public class Guia6_Extras_Ejercicio05 {

    public static void main(String[] args) {
        Mes mes = new Mes();
        Scanner leer = new Scanner(System.in);
        do{
        System.out.println(mes.muestraResultado(mes.comparaMes(mes.preguntaMes())));
            System.out.println("\n\n    Presiones 'a' para volver a adivinar");
        }while ("a".equalsIgnoreCase(leer.nextLine()));
        
        
       /*
        crear arreglo/vector con meses en clase mes (listo)
        crear variable mesSecreto y asiga
        comparar mes ingresado con mesSecreto listo
        repetir hasta que quiera salir
        
        
        
        
        
        */ 
        
            
        
    }

}
