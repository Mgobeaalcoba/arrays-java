import java.util.Scanner;

public class ArreglosNumMayor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el "+i+1+"° número: ");
            numeros[i] = scanner.nextInt();
        }

        // Imprimo los numeros ingresados por el usuario:
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
