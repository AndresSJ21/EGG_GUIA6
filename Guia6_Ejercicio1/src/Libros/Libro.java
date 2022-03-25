/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 *
 * @author Andrés Panella
 */
public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public int nroPags;
    
    public Libro (String isbn, String titulo, String autor, int nroPags){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.nroPags = nroPags;
    }
    
    public Libro (){
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPags() {
        return nroPags;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPags(int nroPags) {
        this.nroPags = nroPags;
    }
    
    public void llenarLibro (String isbn, String titulo, String autor, int nroPags){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPags = nroPags;
    }
    
    public void mostrarLibro (){
        System.out.println("El ISBN del libro es: " + isbn);
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("La cantidad de páginas del libro es: "+ nroPags);
    }


}
