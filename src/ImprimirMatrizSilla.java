import java.util.Scanner;

public class ImprimirMatrizSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int dimensiones = scanner.nextInt();

        int[][] matriz = new int[dimensiones][dimensiones];

        int mitad = (int) dimensiones / 2;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == 0) {
                    matriz[i][j] = 1;
                } else if (i == mitad) {
                    matriz[i][j] = 1;
                } else if (j == matriz.length - 1 && i > mitad) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        if (dimensiones == 0) {
            System.out.println("ERROR");
        }
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        // Imprimir la matriz con formato de matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
