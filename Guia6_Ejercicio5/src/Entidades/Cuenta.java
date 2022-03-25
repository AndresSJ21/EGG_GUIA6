
package Entidades;

/**
 * @author Andrés Panella
 */
public class Cuenta {
// atributos
    private int nroCuenta;
    private int dni;
    private double saldoActual;
    
// constructores
    public Cuenta(){
        
    }

    public Cuenta(int nroCuenta, int dni, double saldoActual) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }
    
 //getters y setters

    public int getNroCuenta() {
        return nroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
// toString

    @Override
    public String toString() {
        return "Cuenta{" + "nroCuenta=" + nroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
