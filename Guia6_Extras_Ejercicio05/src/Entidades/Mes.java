package Entidades;

import java.util.Scanner;

public class Mes {

    public Mes(){
    }

    public String mesSecreto;
    
    
// carga Arreglo con meses del año    
    public String armaListadoMeses(int i) {
        String[] mesesDelAnio = new String[12];
        mesesDelAnio[0] = "enero";
        mesesDelAnio[1] = "febrero";
        mesesDelAnio[2] = "marzo";
        mesesDelAnio[3] = "abril";
        mesesDelAnio[4] = "mayo";
        mesesDelAnio[5] = "junio";
        mesesDelAnio[6] = "julio";
        mesesDelAnio[7] = "agosto";
        mesesDelAnio[8] = "septiembre";
        mesesDelAnio[9] = "octubre";
        mesesDelAnio[10] = "noviembre";
        mesesDelAnio[11] = "diciembre";
        return mesesDelAnio[i];
    }
// genera mes secreto

    public String creaMesSecreto() {
        int aux;
        do {
            aux = (int) (Math.random() * 100);
        } while (aux > 11);
        System.out.println("Mes secreto: "+ (aux + 1));
        mesSecreto=armaListadoMeses(aux);
        return mesSecreto;
    }

    public String preguntaMes() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese mes");
        return leer.nextLine();
    }

    public boolean comparaMes(String mesIngresado) {
        if (mesIngresado.equalsIgnoreCase(creaMesSecreto())) {
            return true;
        } else {
            return false;
        }
    }

    public String muestraResultado(boolean sonIguales) {
        if (sonIguales) {
            return "\n\n¡Ha acertado!";
        } else {
            return "\n\nNo ha acertado. Intente adivinar nuevamente";
        }

    }

}

