package Entidades;

import java.util.Scanner;

public class NIF {
    //atributos
private int dni;
private String nif;

    //constructor
    public NIF (){
        
    }
    
    public NIF (int dni, String nif){
        this.dni=dni;
        this.nif=nif;
    }
    
    //getters and setters
    public int getDni(){
        return dni;
    }
    
    public String getNif(){
        return nif;
    }
    
    public void setDni(int dni){
        this.dni=dni;
    }
    
    public void setNif(String nif){
        this.nif=nif;
    }
    
    
    //metodos
    public NIF crearNif(){
      Scanner leer = new Scanner(System.in);
        System.out.println("Crearemos un nuevo NIF\n"
                + "Ingrese DNI: ");
        int nvoDni =leer.nextInt();
        String nvoNif= calculaLetra(nvoDni);
        NIF nuevoNif = new NIF(nvoDni, nvoNif);
        
        return nuevoNif;
    }
        
    //obtenemos letra nif
    public String calculaLetra(int Dni){
        String[] codificacion = new String[23];
        
        codificacion[0]="T";
        codificacion[1]="R";
        codificacion[2]="W";
        codificacion[3]="A";
        codificacion[4]="G";
        codificacion[5]="M";
        codificacion[6]="Y";
        codificacion[7]="F";
        codificacion[8]="P";
        codificacion[9]="D";
        codificacion[10]="X";
        codificacion[11]="B";
        codificacion[12]="N";
        codificacion[13]="J";
        codificacion[14]="Z";
        codificacion[15]="S";
        codificacion[16]="Q";
        codificacion[17]="V";
        codificacion[18]="H";
        codificacion[19]="L";
        codificacion[20]="C";
        codificacion[21]="K";
        codificacion[22]="E";
 
        int indice = Math.floorMod(Dni, 23);
        System.out.println("la posicion de la letra es "+indice);
        String letra= codificacion[indice];
        return letra;
    }
@Override
public String toString(){
    return dni+"-"+nif;
}
    
}
