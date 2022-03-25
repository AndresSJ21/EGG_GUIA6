//. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
//A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
//pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
//10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
//elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
//elementos y el combinado de 20.
package guia6_ejercicio10;
import java.util.*;

/* @author Andrés Panella
 */
public class Guia6_Ejercicio10 {

    public static void main(String[] args) {
    
    int n1=50;
    double [] arregloA=new double[n1];
    double [] arregloB=new double[20];   
    
    arregloA=llenar(arregloA, arregloA.length);
    mostrarArreglo(arregloA, arregloA.length);
    arregloA=ordenar(arregloA);
    mostrarArreglo(arregloA, arregloA.length);
    arregloB=llenarArreglo(arregloA,arregloB.length);
    mostrarArreglo(arregloB, arregloB.length);
    }
    //usamos static en la declaracion de los métodos porque están en la misma clase
    public static double[] llenar(double arregloA[], int longitud1){
        double [] arreglo1=new double[longitud1];
        for (int i=0; i<longitud1;i++){
        arreglo1[i]=Math.round(Math.random()*99)+1;
     }
        return arreglo1;
    }
   
     public static double[] ordenar(double arregloA[]) {
        Arrays.sort(arregloA);
        return arregloA;
    }
     
     public static double[] llenarArreglo (double arreglo[],int longitud){
         double [] array=new double[longitud];
         array=Arrays.copyOfRange(arreglo, 0, longitud);
         Arrays.fill(array, 10, longitud,0.5);
         return array;
     }
     
     public static void mostrarArreglo (double arreglo[], int longitud){
         double [] arreglo2 = new double [longitud];
         System.out.println(Arrays.toString(arreglo));
     }
     
}
