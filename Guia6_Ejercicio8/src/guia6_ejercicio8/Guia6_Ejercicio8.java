
package guia6_ejercicio8;
import Entidades.Cadena;
import Servicios.CadenaServicios;

/* @author Andrés Panella
 */
public class Guia6_Ejercicio8 {

    public static void main(String[] args) {
        CadenaServicios cs = new CadenaServicios();
        Cadena c = cs.ingresaFrase();
        System.out.println();
        int cantVocales = cs.mostrarVocales(c);
        System.out.println("La cantidad de vocales incluidas en la frase es: "+cantVocales);
        System.out.println();
        String invert = cs.invertirFrase(c);
        System.out.println("La frase invertida es: "+invert);
        System.out.println();
        int repeat = cs.vecesRepetido(c);
        System.out.println("Veces que se repite el caracter ingresado: "+ repeat);
        System.out.println();
        String compara2 = cs.comparaLongitud(c);
        System.out.println(compara2);
        System.out.println();
        String unidas2 = cs.unirFrase(c);
        System.out.println(unidas2);
        System.out.println();
        String reemplaza1=cs.reemplaza(c);
        System.out.println("La nueva frase reemplazando las letras a es: "+reemplaza1);
        System.out.println();
        String contenido1 = cs.contiene(c);
        System.out.println("Es "+contenido1+" que el caracter ingresado está en la cadena original");
        
        
        
        
        
        
    }

}
