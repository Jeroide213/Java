class Usuarioo {
    //Atributos
    String nombre;
    String apellidos;
    int edad;
    String direccion;
    String telefono;

    // constructor de la clase
    public Usuarioo(String nombre, String apellidos, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Método para mostrar la información del objeto
    public void mostrarDatoss() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}

public class Constructornew {
    public static void main(String[] args) {
        //Instancias de Usuario
        Usuarioo usuario1 = new Usuarioo("Juan", "Pérez García", 32, "Av. del Pacífico, 23", "+34-91-000-0000");
        Usuarioo usuario2 = new Usuarioo("María", "Rodríguez Martínez", 28, "C/ del Sol, 5", "+34-91-000-0000");

        //Llamada al método de información del objeto
        usuario1.mostrarDatoss();
        usuario2.mostrarDatoss();
    }
}