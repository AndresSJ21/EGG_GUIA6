/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;
import java.util.Scanner;
/**
 *
 * @author Andrés Panella
 */
public class Libros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1=new Libro ();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN del libro");
        String isbn = scan.next();
        
        System.out.println("Ingrese el título del libro");
        String titulo = scan.next();
        
        System.out.println("Ingrese el autor del libro");
        String autor = scan.next();
        
        System.out.println("Ingrese cantidad de páginas del libro");
        int cantPags = scan.nextInt();
        
        libro1.llenarLibro(isbn, titulo, autor, cantPags);
        libro1.mostrarLibro();
        
    }
    
}
