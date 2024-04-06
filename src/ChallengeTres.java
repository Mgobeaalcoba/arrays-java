import java.util.Scanner;

public class ChallengeTres {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el "+(i+1)+"° número: ");
            numeros[i] = scanner.nextInt();
        }

        int totalPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                totalPositivos++;
            }
        }

        int totalNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                totalNegativos++;
            }
        }

        int totalCeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                totalCeros++;
            }
        }

        int[] positivos = new int[totalPositivos];
        int[] negativos = new int[totalNegativos];
        int[] ceros = new int[totalCeros];

        // Lleno los arreglos
        for (int i = 0; i < numeros.length; i++ ) {
            if (numeros[i] > 0) {
                positivos[totalPositivos - 1] = numeros[i];
                totalPositivos--;
            } else if (numeros[i] < 0) {
                negativos[totalNegativos - 1] = numeros[i];
                totalNegativos--;
            } else {
                ceros[totalCeros - 1] = numeros[i];
                totalCeros--;
            }
        }

        int sumaPositivos = 0;
        for (int i = 0; i < positivos.length; i++) {
            sumaPositivos += positivos[i];
        }

        int sumaNegativos = 0;
        for (int i = 0; i < negativos.length; i++) {
            sumaNegativos += negativos[i];
        }

        double promedioPositivos = (double) sumaPositivos / positivos.length;
        double promedioNegativos = (double) sumaNegativos / negativos.length;

        if (Double.isNaN(promedioPositivos)) {
            promedioPositivos = 0;
        }
        if (Double.isNaN(promedioNegativos)) {
            promedioNegativos = 0;
        }

        // Imprimo los promedios y la cuenta de ceros
        System.out.println("El promedio de los números positivos es: " + promedioPositivos);
        System.out.println("El promedio de los números negativos es: " + promedioNegativos);
        System.out.println("La cantidad de ceros es: " + ceros.length);
    }
}
