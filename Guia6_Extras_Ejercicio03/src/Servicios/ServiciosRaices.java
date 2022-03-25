package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServiciosRaices {

    Raices coeficientes;

    public Raices cargarCoeficientes() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca coeficientes para ecuación de grado 2:");
        System.out.println("  a: ");
        double a = leer.nextDouble();
        System.out.println("  b: ");
        double b = leer.nextDouble();
        System.out.println("  c: ");
        double c = leer.nextDouble();
        System.out.println("\n\nLos coeficientes ingresados son:");
        System.out.println("  a= "+a+" ; b= "+b+" ; c= "+c+"\n");
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices coeficientes) {
        double discriminante = (Math.pow(coeficientes.getB(), 2)) - (4 * coeficientes.getA() * coeficientes.getC());
        return discriminante;
    }

    public boolean tieneRaices(Raices coeficientes) {

        return getDiscriminante(coeficientes) >= 0;
    }

    public boolean tieneRaiz(Raices coeficientes) {

        return getDiscriminante(coeficientes) == 0;
    }

    public String obtenerRaices(Raices coeficientes) {
        if (tieneRaices(coeficientes)) {
            return "las posibles soluciones son\n"
                    + "  x1 = (-b+√((b^2)-(4*a*c)))/(2*a)\n"
                    + "  x2 = (-b-√((b^2)-(4*a*c)))/(2*a)\n";
        } else {
            return "La ecuación no tiene solución";
        }
    }

    public String obtenerRaiz(Raices coeficientes) {
        if (tieneRaiz(coeficientes)) {
            return "   x1 = x2 = (-b+√((b^2)-(4*a*c)))/(2*a)\n";
        } else {
            return "";
        }

    }

    public double[] calcular(Raices coeficientes) {

        double[] raices = new double[2];
        double raiz;
        raiz = Math.sqrt((Math.pow(coeficientes.getB(), 2) - 4 * coeficientes.getA() * coeficientes.getC())) / (2 * coeficientes.getA());
        if (tieneRaices(coeficientes) && !(tieneRaiz(coeficientes))) {
            raices[0] = ((-coeficientes.getB()) + raiz) / (2 * coeficientes.getA());
            raices[1] = ((-coeficientes.getB()) - raiz) / (2 * coeficientes.getA());
            System.out.println("Las soluciones de la ecuación son\n"
                    + "  x1= " + raices[0] + "\n"
                    + "  x2= " + raices[1] + "\n");

        } else if (tieneRaices(coeficientes) && (tieneRaiz(coeficientes))) {
            raices[0] = ((-coeficientes.getB()) + raiz) / (2 * coeficientes.getA());
            raices[1] = raices[0];
            System.out.println("Las soluciones de la ecuación son iguales\n"
                    + "  x1=x2= " + raices[0] + "\n");

        } else {
            raices[0] = 0;
            raices[1] = 0;
            System.out.println("La ecuación no tiene solucion\n");
        }

        return raices;
    }

}
