public class MatrizSimetrica {
    public static void main(String[] args) {
        // Declaración de una matriz simétrica de 3x3
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,1}
        }; // Matriz simétrica. Es simétrica porque matriz[i][j] == matriz[j][i]

        imprimirMatriz(matriz);

        // Verifico si la matriz es simétrica
        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        // Imprimir la matriz con formato de matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|" + matriz[i][j] + "|\t");
            }
            System.out.println();
        }
    }

    public static boolean esSimetrica(int[][] matriz) {
        // Metodo para verificar si una matriz es simetrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Verifico si la matriz es simétrica
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
