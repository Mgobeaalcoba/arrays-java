import java.util.Scanner;

public class ArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] numeros = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el "+(i+1)+"° número: ");
            numeros[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i+1]) {
                ascendente = true;
            } else if (numeros[i] > numeros[i+1]) {
                descendente = true;
            }
        }

        if (ascendente && !descendente) {
            System.out.println("Los números están en orden ascendente.");
        } else if (!ascendente && descendente) {
            System.out.println("Los números están en orden descendente.");
        } else if (ascendente && descendente) {
            System.out.println("Los números están desordenados.");
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}
