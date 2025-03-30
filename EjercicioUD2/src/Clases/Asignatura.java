package Clases;

/**
 * Representa una asignatura con su nombre y la cantidad de horas dedicadas a ella.
 */
public class Asignatura {

    /** El nombre de la asignatura */
    private String nombreAsignatura;
    
    /** El número de horas de la asignatura */
    private int horas;

    /**
     * Constructor de la clase Asignatura.
     * 
     * @param nA El nombre de la asignatura.
     * @param h El número de horas dedicadas a la asignatura.
     */
    public Asignatura(String nA, int h) {
        nombreAsignatura = nA;
        horas = h;
    }

    /**
     * Muestra los atributos del objeto Asignatura.
     * Imprime en consola el nombre de la asignatura y la cantidad de horas.
     */
    public void mostrarA() {
        System.out.printf("%s  %d horas", nombreAsignatura, horas);
    }
}
