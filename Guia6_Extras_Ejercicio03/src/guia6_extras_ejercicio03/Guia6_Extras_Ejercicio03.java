
package guia6_extras_ejercicio03;

import Entidades.Raices;
import Servicios.ServiciosRaices;


public class Guia6_Extras_Ejercicio03 {

    public static void main(String[] args) {
        ServiciosRaices servRaiz = new ServiciosRaices();
        Raices raiz = servRaiz.cargarCoeficientes();
        System.out.println(servRaiz.obtenerRaices(raiz));
        System.out.println(servRaiz.obtenerRaiz(raiz));
        servRaiz.calcular(raiz);
    }
}
