package Auxiliares;

/**
 * Esta clase proporciona operaciones matemáticas básicas como suma, resta, multiplicación y división.
 * Los métodos utilizan las variables estáticas {@code a} y {@code b} para realizar los cálculos.
 */
public class Matematicas {

    // Variables estáticas utilizadas para los cálculos.
    static float a;
    static float b;

    /**
     * Suma las variables {@code a} y {@code b} y retorna el resultado.
     *
     * @param A el primer número a sumar.
     * @param B el segundo número a sumar.
     * @return el resultado de la suma.
     */
    public static float Sumar(float A, float B) {
        float suma = a + b;
        System.out.println("El resultado de la suma es " + suma);
        return suma;
    }

    /**
     * Resta la variable {@code a} con la variable {@code b} y retorna el resultado.
     *
     * @param A el primer número a restar.
     * @param b el segundo número a restar.
     * @return el resultado de la resta.
     */
    public static float Restar(float A, float b) {
        float resta = a - b;
        System.out.println("El resultado de la resta es " + resta);
        return resta;
    }

    /**
     * Multiplica las variables {@code a} y {@code b} y retorna el resultado.
     *
     * @param A el primer número a multiplicar.
     * @param B el segundo número a multiplicar.
     * @return el resultado de la multiplicación.
     */
    public static float producto(float A, float B) {
        float product = a * b;
        System.out.println("El producto de a y b es " + product);
        return product;
    }

    /**
     * Divide la variable {@code a} entre la variable {@code b} y retorna el resultado.
     *
     * @param A el numerador de la división.
     * @param B el denominador de la división.
     * @return el resultado de la división.
     * @throws ArithmeticException si {@code b} es cero.
     */
    public static float dividir(float A, float B) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        float division = a / b;
        System.out.println("La división entre a y b es " + division);
        return division;
    }
}
