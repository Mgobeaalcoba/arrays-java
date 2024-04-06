public class MatricesIdentidad {
    public static void main(String[] args) {
        // Declaración de una matriz de 5x5
        int[][] matriz = new int[5][5];

        // Asignación de valores: 1 a la diagonal principal y 0 al resto
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Imprimo la matriz Identidad:
        MatrizSimetrica.imprimirMatriz(matriz);

        // Asignación de valores: 1 a la fila inferior, 1 a la fila superior, 1 a la diagonal principal y 0 al resto
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j] = 1;
                }
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Imprimo la matriz que tiene limites y diagonal principal con 1:
        MatrizSimetrica.imprimirMatriz(matriz);

        // Asignación de valores: 1 a la fila inferior, 1 a la fila superior, 1 a la columna 0 y a la ultima columna, 1 a la diagonal principal y 0 al resto
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j] = 1;
                }
                if (j == 0 || j == matriz[0].length - 1) {
                    matriz[i][j] = 1;
                }
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Imprimo la matriz que tiene limites y diagonal principal con 1:
        MatrizSimetrica.imprimirMatriz(matriz);
    }
}
