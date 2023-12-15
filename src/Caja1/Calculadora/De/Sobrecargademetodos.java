package Caja1.Calculadora.De;

public class Sobrecargademetodos {

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: Método para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sobrecargademetodos operaciones = new Sobrecargademetodos();

        // Llamadas a los métodos sobrecargados
        int resultado1 = operaciones.sumar(5, 10);
        int resultado2 = operaciones.sumar(2, 3, 4);
        double resultado3 = operaciones.sumar(2.5, 3.7);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}