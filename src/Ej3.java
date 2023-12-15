public class Ej3 {
    public static void main(String[] args) {
        //variables del programa
        byte numero1 = 10;
        byte numero2 = 15;
        byte numero3 = 10;
        //condicional if
        if (numero2 < numero3) {
            System.out.println("Se ejecuta el primer if.");
        } else if (numero1 > 50) {
            System.out.println("Se ejecuta el segundo else if.");
        } else if (numero2 == 15) {
            System.out.println("Se ejecuta el tercer else if.");
        } else {
            System.out.println("Se ejecuta el else.");
        }
    }
}