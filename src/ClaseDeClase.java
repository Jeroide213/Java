class Usuario{  //Este objeto va a tener datos personales
    String nombre = "Cosme";
    String apellidos = "Fulanito";
    int edad = 18;
    String direccion = "Calle falsa 123";
    String telefono = "+54 11 6711 8855";

    public void mostrardatos(){ //Esto es el metodo(funcion) que podemos usar desde otras clases
        System.out.println("Nombre: " + nombre);
        System.out.println(" Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }
}
public class ClaseDeClase {
    public static void main(String[] args){
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        usuario2.nombre = "Benito";
        usuario2.apellidos = "Camela";
        usuario2.edad = 17;
        usuario2.direccion= "Calle falsa 1234";
        usuario2.telefono = "54 11 6969 6969";
        usuario1.mostrardatos();
        usuario2.mostrardatos();
        //Aca estamos creando otro objeto llamado usuario2 y le estamos asignando nuevos datos personales.
    }
}
