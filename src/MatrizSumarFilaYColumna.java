public class MatrizSumarFilaYColumna {
    public static void main(String[] args) {
        // Declaración de una matriz de 3x3
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        MatrizSimetrica.imprimirMatriz(matriz);

        int sumaFila, sumaColumna;
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna = 0;
            sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            System.out.println("La suma de la fila " + i + " es " + sumaFila);
            System.out.println("La suma de la columna " + i + " es " + sumaColumna);
        }
    }
}
