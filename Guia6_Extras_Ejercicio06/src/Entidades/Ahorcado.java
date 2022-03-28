package Entidades;

import java.util.Scanner;

public class Ahorcado {

    private char[] palabraXadivinar;
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {

    }

    public Ahorcado(char[] palabraXadivinar, int letrasEncontradas, int jugadasMaximas) {
        this.palabraXadivinar = palabraXadivinar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabraXadivinar() {
        return palabraXadivinar;
    }

    public void setPalabraXadivinar(char[] palabraXadivinar) {
        this.palabraXadivinar = palabraXadivinar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public Ahorcado creaJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------- Bienvenidos al juego del AHORCADO -----------\n");
        System.out.println("Ingrese palabra a adivinar:");
        palabraXadivinar = leer.nextLine().toCharArray();
        System.out.println("Ingrese cantidad de jugadas máximas");
        jugadasMaximas = leer.nextInt();
        letrasEncontradas = 0;
        return new Ahorcado(palabraXadivinar, letrasEncontradas, jugadasMaximas);
    }

    public int longitud() {
        return palabraXadivinar.length;
    }

    public char buscarLetra() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese letra a buscar: ");
        char caracter = leer.next().charAt(0);
        boolean existe = false;
        for (char c : palabraXadivinar) {
            if (c == caracter) {
                existe = true;
            }
        }
        if (existe) {
            System.out.println("El caracter está en la palabra");
        } else {
            System.out.println("El caracter NO está en la palabra");
        }

        return caracter;
    }

    public boolean encontradas(char caracter) {
        boolean encontrada = false;

        int count = 0;
        for (int i = 0; i < palabraXadivinar.length; i++) {

            if (getPalabraXadivinar()[i] == caracter) {
                count++;

            }
        }
        setLetrasEncontradas(getLetrasEncontradas() + count);
        System.out.println("Y aparece " + count + " veces");
        setJugadasMaximas(getJugadasMaximas() - 1);
        System.out.println("La cantidad de letras encontradas es " + letrasEncontradas);
        System.out.println("La cantidad de letras por adivinar es " + (palabraXadivinar.length - getLetrasEncontradas()));
        return encontrada;

    }

    public String intentos() {
        return "Te quedan " + jugadasMaximas + " intentos";
    }

    public String juego() {
        Ahorcado ahorcado = creaJuego();
        System.out.println("La palabra a adivinar tiene " + longitud() + " letras");
        do {
            boolean laEncontro = encontradas(buscarLetra());
            if(getJugadasMaximas()!=0){
            System.out.println("\n" + intentos());
            }
            
        } while (getJugadasMaximas() != 0);
        if ((getJugadasMaximas() == 0) && (getLetrasEncontradas() == palabraXadivinar.length)) {
            System.out.println("Adivinaste!!!!!!");
        } else if ((getJugadasMaximas() == 0) && (getLetrasEncontradas() < palabraXadivinar.length)) {
            System.out.println("Perdiste!!! no has adivinado la palabra");
        } else{
            
        }
        return "Juego Finalizado";
    }
}
