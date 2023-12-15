package Evaluacion;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        while (true) {//Este while se va a ejecutar infinitamente hasta que un "break" lo corte.
            Scanner inicio = new Scanner(System.in);

            System.out.println("Desea hacer un calculo?.");
            System.out.println("1: Si.");
            System.out.println("2: No.");

            int siono = inicio.nextInt();
            if (siono == 1) {
                System.out.println("Que tipo de calculo quiere hacer?.");
                System.out.println("1: Suma.");
                System.out.println("2:Resta.");
                System.out.println("3:Multiplicacion.");
                System.out.println("4:Division.");

                Scanner pregunta = new Scanner(System.in);
                int Tipodecalculo = pregunta.nextInt(); //Esta entrada en la consola define que tipo de calculo se hace

                Scanner numero1 = new Scanner(System.in);
                Scanner numero2 = new Scanner(System.in);

                if (Tipodecalculo == 1) {
                    System.out.println("Escribe el primer numero.");
                    int numero1suma = numero1.nextInt();
                    System.out.println("Escribe el segundo numero.");
                    int numero2suma = numero2.nextInt();
                    int resultadosuma = numero1suma + numero2suma;
                    System.out.println(resultadosuma);

                } else if (Tipodecalculo == 2) {
                    System.out.println("Escribe el primer numero.");
                    int numero1resta = numero1.nextInt();
                    System.out.println("Escribe el segundo numero.");
                    int numero2resta = numero2.nextInt();
                    int resultadoresta = numero1resta - numero2resta;
                    System.out.println(resultadoresta);

                } else if (Tipodecalculo == 3) {
                    System.out.println("Escribe el primer numero.");
                    int numero1multi = numero1.nextInt();
                    System.out.println("Escribe el segundo numero.");
                    int numero2multi = numero2.nextInt();
                    int resultadomulti = numero1multi * numero2multi;
                    System.out.println(resultadomulti);

                } else if (Tipodecalculo == 4) {
                    try {//Este bloque try es por si hay alguna excepcion
                        System.out.println("Escribe el primer numero.");
                        int numero1division = numero1.nextInt();
                        System.out.println("Escribe el segundo numero.");
                        int numero2division = numero2.nextInt();
                        int resultadodivision = numero1division / numero2division;
                        System.out.println(resultadodivision);
                    }catch(ArithmeticException resultadodivision){ //Esto esta por si gratto se hace el gracioso poniendo 0
                        System.out.println("Lo siento, no se puede dividir por 0.");
                    }
                } else {
                    System.out.println("Error, opcion no valida.");
                }
            } else {
                System.out.println("Se cierra la calculadora.");
                break;//Este break rompe el while de arriba.
            }
        }
    }
}