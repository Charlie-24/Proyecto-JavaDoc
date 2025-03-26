package Auxiliares;

public class Matematicas {
	
static float a;
static float b;

// Suma la variable A y B 
	public static float Sumar(float A, float B) {
		
		float suma=a+b;
		System.out.println("El resultado de la suma es "+suma);
		return suma;
		
	}
// Resta la variable A y B 
	public static float Restar(float A,float b) {
		
		float resta=a-b;
		System.out.println("El resultado de la resta es "+resta);
		return resta;
		
	}
	// Multiplica la variable A por la B 
	public static float producto(float A, float B) {
		
		float product=a*b;
		System.out.println("El producto de a y b es "+product);
		return product;
	}
	
	// Divide la variable A entre la B 
		
	public static float dividir(float A, float B) {
		
		float division=a/b;
		System.out.println("La division entre a y b es "+division);
		return division;

	}
 
}
