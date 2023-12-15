package Caja1.Calculadora.De;
import java.util.Scanner;

public class JuegoDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("¿Quieres jugar a los dados? (si/no): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Fin del juego. ¡Hasta luego!");
                break;
            } else if (respuesta.equalsIgnoreCase("si")) {
                int numeroIngresado;

                // Solicitar un número del 1 al 100 y validar la entrada
                do {
                    System.out.print("Ingresa un número del 1 al 100: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Error: Ingresa un número válido.");
                        scanner.next(); // Limpiar el buffer
                    }
                    numeroIngresado = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    if (numeroIngresado < 1 || numeroIngresado > 100) {
                        System.out.println("Error: El número debe estar entre 1 y 100. Inténtalo de nuevo.");
                    }
                } while (numeroIngresado < 1 || numeroIngresado > 100);

                // Generar resultado de un dado de 20 lados basado en la fuerza
                int fuerza = calcularFuerza(numeroIngresado);
                int resultadoDado = lanzarDadoDeVeinte(fuerza);
                System.out.println("¡Has lanzado un dado de 20 con una fuerza de " + fuerza +
                        " y obtuviste un resultado de " + resultadoDado + "!");

            } else {
                System.out.println("Respuesta no válida. Por favor, ingresa 'si' o 'no'.");
            }
        }

        scanner.close();
    }

    // Calcula la fuerza basada en el número ingresado
    private static int calcularFuerza(int numeroIngresado) {
        return Math.min(numeroIngresado, 10); // Limita la fuerza a un máximo de 10
    }

    // Simula el lanzamiento de un dado de 20 lados con una fuerza dada
    private static int lanzarDadoDeVeinte(int fuerza) {
        return (int) (Math.random() * 20 * fuerza) + 1;
    }
}