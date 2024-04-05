public class SumarMatrices {
    public static void main(String[] args) {
        // Sumar dos matrices en una tercera matriz
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizSuma = new int[3][3];

        // Asignación de valores a los elementos de las matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = i + j;
                matriz2[i][j] = i + j;
            }
        }

        MatrizSimetrica.imprimirMatriz(matriz1);
        MatrizSimetrica.imprimirMatriz(matriz2);

        // Suma de las matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        MatrizSimetrica.imprimirMatriz(matrizSuma);
    }
}
