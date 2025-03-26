package Clases;

public class Asignatura {
	
	private String nombreAsignatura;
	private int horas;

	public Asignatura(String nA,int h) {
		
		nombreAsignatura=nA;
		horas=h;
		
	}
	//Muestra los atributos del objeto Asignatura
	public void mostrarA() {
		System.out.printf("%s  %d horas" ,nombreAsignatura,horas);
	}
}
