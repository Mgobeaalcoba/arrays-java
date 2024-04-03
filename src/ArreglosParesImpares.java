import java.util.Scanner;

public class ArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el "+(i+1)+"° número: ");
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                pares[j] = a[i];
                j++;
            } else {
                impares[k] = a[i];
                k++;
            }
        }

        // Imprimo los números pares
        for(int i = 0; i < pares.length; i++) {
            System.out.println("pares["+i+"] = " + pares[i]);
        }

        // Imprimo los números impares
        for(int i = 0; i < impares.length; i++) {
            System.out.println("impares["+i+"] = " + impares[i]);
        }

        // Imprimo los números ingresados por el usuario
        for(int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
    }
}
