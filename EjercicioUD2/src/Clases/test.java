package Clases;

import java.util.Scanner;

/**
 * Clase de prueba que permite la introducción de datos para un objeto Alumno y un objeto Asignatura.
 * Crea un objeto de tipo Alumno con los datos proporcionados por el usuario y muestra sus atributos.
 * Luego, crea un objeto de tipo Asignatura y muestra sus atributos.
 */
public class test {

    /**
     * Método principal que ejecuta el programa.
     * Permite al usuario ingresar los datos de un alumno y una asignatura, luego muestra los atributos de ambos objetos.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {

        // Introducción de datos para el Alumno
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el DNI");
        String d = sc.nextLine();  // Lee el DNI
        
        System.out.println("Introduce el nombre");
        String n = sc.nextLine();  // Lee el nombre
        
        System.out.println("Introduce los apellidos");
        String a = sc.nextLine();  // Lee los apellidos
        
        // Crea un objeto Alumno y muestra sus atributos
        Alumno alumno = new Alumno(d, n, a);
        alumno.mostrar();
        
        // Introducción de datos para la Asignatura
        System.out.println("Introduce el nombre de la asignatura");
        String nA = sc.nextLine();  // Lee el nombre de la asignatura
        
        System.out.println("Introduce el numero de horas");
        int h = Integer.parseInt(sc.nextLine());  // Lee las horas de la asignatura
        
        // Crea un objeto Asignatura y muestra sus atributos
        Asignatura asignatura = new Asignatura(nA, h);
        asignatura.mostrarA();
    }
}

