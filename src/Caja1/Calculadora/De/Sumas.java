package Caja1.Calculadora.De;

import java.util.Scanner;

public class Sumas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa primer numero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingresa segundo numero: ");
        int numero2 = entrada.nextInt();

        int suma = numero1 + numero2;
         System.out.print(suma);
    }
}
