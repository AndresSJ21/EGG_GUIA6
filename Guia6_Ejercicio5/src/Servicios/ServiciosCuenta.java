
package Servicios;
import Entidades.Cuenta;
import java.util.Scanner;
/**
 * @author Andrés Panella
 */
public class ServiciosCuenta {
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número de cuenta a crear");
        int nroCuenta=leer.nextInt();
        System.out.println("Ingrese DNI del titular");
        int dni=leer.nextInt();
        System.out.println("Ingrese el saldo actual de la cuenta");
        double saldoActual=leer.nextDouble();
        
        return new Cuenta(nroCuenta, dni, saldoActual);
    }
    
    public void ingresarDinero (Cuenta c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el monto a ingresar");
        c1.setSaldoActual(leer.nextDouble()+ c1.getSaldoActual());
        System.out.println("El saldo acutal es "+ c1.getSaldoActual());
    }
    
    public void retirarDinero (Cuenta c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el monto a retirar");
        Double retiro = leer.nextDouble();
        if (retiro>=c1.getSaldoActual()){
            c1.setSaldoActual(0);
        }else {
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
        }
        System.out.println("El saldo acutal es "+ c1.getSaldoActual());
    }
    
    public void extraccionRapida (Cuenta c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique monto a retirar, máximo 20% del saldo");
        Double retiro = leer.nextDouble();
        if (retiro>c1.getSaldoActual()*0.2){
            c1.setSaldoActual(c1.getSaldoActual()*(1-0.2));
        }else {
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
        }
        System.out.println("El saldo acutal es "+ c1.getSaldoActual());
    }
    
    public void consultaSaldo (Cuenta c1){
        System.out.println("El saldo acutal es "+ c1.getSaldoActual());
    }
    
    public void consultaDatos (Cuenta c1){
        System.out.println(c1);
    }
}
