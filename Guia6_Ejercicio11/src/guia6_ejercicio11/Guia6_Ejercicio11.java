//11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle

package guia6_ejercicio11;
import java.util.Scanner;
import java.util.Date;
/* @author Andrés Panella
 */
public class Guia6_Ejercicio11 {

    public static void main(String[] args) {
    
    Date fecha1 = new Date();
    fecha1=ingresaFecha();
    muestraFecha(fecha1);
    calculaDiferenciaAnios(fecha1);
       
    }

    public static Date ingresaFecha (){
        int anio;
        int mes;
        int dia;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese:\ndia\nmes\naño\n");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        return fecha;            
    }
    
    public static void muestraFecha (Date fecha){
        Date mFecha = new Date(fecha.getYear(), fecha.getMonth(),fecha.getDate());
        System.out.println("La fecha ingresada es:\n"+mFecha);
    }
    
    public static void calculaDiferenciaAnios (Date fecha){
        Date fechaActual = new Date();
        System.out.println("Hay "+Math.abs(fechaActual.getYear()-fecha.getYear())+" años de diferencia entre la fecha actual y la fecha ingresada");
    }
    
}
