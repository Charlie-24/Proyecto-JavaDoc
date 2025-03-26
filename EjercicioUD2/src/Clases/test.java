package Clases;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		
		//Introduccion datos Alumno 
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el DNI");
		String d=sc.nextLine();
		System.out.println("Introduce el nombre");
		String n=sc.nextLine();
		System.out.println("Introduce los apellidos");
		String a=sc.nextLine();
		
		Alumno alumno = new Alumno(d,n,a);
		alumno.mostrar();
		
		//Introduccion datos Asignatura
		System.out.println("Introduce el nombre de la asignatura");
		String nA=sc.nextLine();
		System.out.println("Introduce el numero de horas");
		int h=Integer.parseInt(sc.nextLine());
		
		Asignatura asignatura = new Asignatura(nA,h);
		asignatura.mostrarA();
		
	}

	

}
