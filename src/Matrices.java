public class Matrices {
    public static void main(String[] args) {
        // Declaración de una matriz de 3x3
        int[][] matriz = new int[3][3];
        // Asignación de valores a los elementos de la matriz
        for (int i = 0; i < matriz.length; i++) { // Recorro las filas. matriz.length me da el número de filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorro las columnas. matriz[i].length me da el número de columnas de la fila i
                matriz[i][j] = i + j;
            }
        }
        // Imprimo los valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[i][j] = " + matriz[i][j]);
            }
        }
        // Imprimo la matriz completa
        System.out.println("matriz = " + matriz); // Imprime la dirección de memoria de la matriz

        // Declaración e instanciación de una matriz de 3x3
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Imprimo los valores
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("matriz2["+i+"]["+j+"] = " + matriz2[i][j]);
            }
        }
    }
}
