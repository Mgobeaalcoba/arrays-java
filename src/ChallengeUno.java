import java.util.Scanner;

public class ChallengeUno {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el "+(i+1)+"° número: ");
            numeros[i] = scanner.nextInt();
        }

        int total = numeros.length;
        // Imprimo el arreglo de números ingresados por el usuario
        for (int i = 0; i < (total / 2); i++) {
            System.out.println("numeros[" + (total -1 - i) + "] = " + numeros[(total -1 - i)]);
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
