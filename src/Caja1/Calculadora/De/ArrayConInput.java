package Caja1.Calculadora.De;
import java.util.Arrays;
import java.lang.String;
import java.util.Scanner;

public class ArrayConInput {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos numeros deseas ingresar? ");
        int cantidad = Integer.parseInt(entrada.nextLine());
        int[] numeros = new int[cantidad];

        for (int i = 0 ; i < cantidad ; i++){
            System.out.print("Numero " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print("Los numeros son: ");
        for (int numero : numeros){
            System.out.println(numero);
        }
    }
}
