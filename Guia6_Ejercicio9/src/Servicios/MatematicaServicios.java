
package Servicios;

import Entidades.Matematica;

/**
 * @author Andrés Panella
 */
public class MatematicaServicios {
   
    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
    //valor
    public Double devolverMayor (Matematica m){
        Double elMayor = Math.max(m.getNum1(),m.getNum2());
        return elMayor;
    }
    
    //• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public Double calcularPotencia (Matematica m){
        Double laPotencia = Math.pow(Math.round(Math.max(m.getNum1(),m.getNum2())), Math.round(Math.min(m.getNum1(),m.getNum2())));
        return laPotencia;
    }
    
    //• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public Double calculaRaiz (Matematica m){
       Double raiz = Math.sqrt(Math.abs(Math.min(m.getNum1(), m.getNum2())));
       return raiz;
    }
    
}
