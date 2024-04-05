import java.util.Scanner;

public class ImprimirMatrizN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int dimensiones = scanner.nextInt();

        char[][] matriz = new char[dimensiones][dimensiones];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 'X';
                } else if (i == matriz.length - j - 1) {
                    matriz[i][j] = 'X';
                } else {
                    matriz[i][j] = '_';
                }
            }
        }

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(char[][] matriz) {
        // Imprimir la matriz con formato de matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
