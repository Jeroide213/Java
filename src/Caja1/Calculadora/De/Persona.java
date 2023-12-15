package Caja1.Calculadora.De;

public class Persona {

    private String nombre;
    private int edad;

    // Constructor principal
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrecarga: Constructor sin especificar la edad
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0; // Valor predeterminado para la edad
    }

    // Sobrecarga: Constructor sin parámetros
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana");
        Persona persona3 = new Persona();

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona3.mostrarInformacion();
    }
}