package Caja1.Calculadora.De;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner juego = new Scanner(System.in);
        String respuesta = juego.nextLine();
        System.out.println("Queres tirar el dado? Responde con si o con no");
        while (respuesta.equalsIgnoreCase("SI")) {
            if (respuesta.equalsIgnoreCase("SI")) {
                Scanner fuerza = new Scanner(System.in);
                System.out.println("Con cuanta fuerza queres tirar?");
                int potencia = fuerza.nextInt();
                if (potencia >= 0 && potencia <= 25) {
                    System.out.println("Tiraste despacio, sacas un 1 en el D4");
                } else if (potencia >= 26 && potencia <= 50) {
                    System.out.println("Tiraste moderado, sacas un 2 ene el D4");
                } else if (potencia >= 51 && potencia <= 75) {
                    System.out.println("Tiraste fuerte, sacas un 3 en el D4");
                } else if (potencia >= 76 && potencia <= 100) {
                    System.out.println("Tiraste potente, sacas  un 4 en el D4");
                } else {
                    System.out.println("Te pasaste de mambo tirando o no tiraste con demasiada fuerza");
                }
            }else
            System.out.println("Se termina el juego");
        }
    }
}