package Clases;

import java.util.Random;

public class Alumno {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int nivelProgramacion=(int) (Math.random()*10+1);
	
	
		
	
	public Alumno(String d, String n, String a) {
		
		dni=d;
		nombre=n;
		apellidos=a;
		
		
	}
	
	//Muestra los atributos del objeto Alumno
	public void mostrar() {
		System.out.printf("DNI:%s\n Nombre: %s\n apellidos: %s\n Nivel de programacion: %d \n ",dni,nombre,apellidos,nivelProgramacion);
	}
	
	

}
