//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: 
   
    //numeroCuenta (entero), 
    //el DNI del cliente (entero largo), 
    //el saldo actual

//Las operaciones asociadas a dicha clase son:
    //• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    //• Agregar los métodos getters y setters correspondientes
    
    //• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    //• Método ingresar dinero(double ingreso): el método recibe una cantidad de dinero a
    //ingresar y se la sumara a saldo actual.
    //• Método retirar dinero(double retiro): el método recibe una cantidad de dinero a retirar y
    //se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    //• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    //que el usuario no saque más del 20%.
    //• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    //• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta


package guia6_ejercicio5;
import Servicios.ServiciosCuenta;
import Entidades.Cuenta;

        
/* @author Andrés Panella
 */
public class Guia6_Ejercicio5 {

    public static void main(String[] args) {
        ServiciosCuenta sc = new ServiciosCuenta();
        Cuenta c1=sc.crearCuenta();
        sc.ingresarDinero(c1);
        sc.retirarDinero(c1);
        sc.extraccionRapida(c1);
        sc.consultaSaldo(c1);
        sc.consultaDatos(c1);
    }

}
