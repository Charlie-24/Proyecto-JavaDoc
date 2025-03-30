package Clases;

import java.util.Random;

/**
 * Representa a un alumno con su DNI, nombre, apellidos y nivel de programación.
 * El nivel de programación se asigna aleatoriamente entre 1 y 10.
 */
public class Alumno {

    /** El DNI del alumno */
    private String dni;
    
    /** El nombre del alumno */
    private String nombre;
    
    /** Los apellidos del alumno */
    private String apellidos;
    
    /** El nivel de programación del alumno, asignado aleatoriamente entre 1 y 10 */
    private int nivelProgramacion = (int) (Math.random() * 10 + 1);

    /**
     * Constructor de la clase Alumno.
     * 
     * @param d El DNI del alumno.
     * @param n El nombre del alumno.
     * @param a Los apellidos del alumno.
     */
    public Alumno(String d, String n, String a) {
        dni = d;
        nombre = n;
        apellidos = a;
    }

    /**
     * Muestra los atributos del objeto Alumno.
     * Imprime en consola el DNI, nombre, apellidos y nivel de programación del alumno.
     */
    public void mostrar() {
        System.out.printf("DNI: %s\nNombre: %s\nApellidos: %s\nNivel de programación: %d\n", dni, nombre, apellidos, nivelProgramacion);
    }
}

