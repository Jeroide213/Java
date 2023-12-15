public class Main {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 1;
        int numero3 = 0;
        while(numero3 <= 1597){
            System.out.print(numero3 + " ");
            numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;
        }
    }
}