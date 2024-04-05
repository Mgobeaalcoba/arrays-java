public class MatrizColumnasVariables {
    public static void main(String[] args) {
        // Declaración de una matriz de 3 filas y columnas variables
        int[][] matriz = new int[3][];

        // Asignación de valores a los elementos de la matriz
        matriz[0] = new int[2]; // 2 columnas
        matriz[1] = new int[3]; // 3 columnas
        matriz[2] = new int[4]; // 4 columnas

        // Asignación de valores a los elementos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Imprimo los valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz2["+i+"]["+j+"]" + matriz[i][j]);
            }
        }

        // Imprimir la matriz con formato de matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|" + matriz[i][j] + "|\t");
            }
            System.out.println();
        }
    }
}
