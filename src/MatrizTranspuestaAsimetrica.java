public class MatrizTranspuestaAsimetrica {
    public static void main(String[] args) {
        // Declaración de una matriz simétrica de 4x8
        int[][] matriz = {
                {1,1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2,2},
                {3,3,3,3,3,3,3,3},
                {4,4,4,4,4,4,4,4}
        }; // Matriz asimétrica. No es simétrica porque matriz[i][j] != matriz[j][i]

        // Imprimo la matriz usando el metodo que cree anteriormente
        MatrizSimetrica.imprimirMatriz(matriz);

        // Verifico si es simétrica usando el mismo método.
        if(MatrizSimetrica.esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        };

        // Creo una matriz traspuesta
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];

        // Imprimo la matriz traspuesta vacia
        MatrizSimetrica.imprimirMatriz(matrizTraspuesta);

        // Lleno la matriz traspuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        // Imprimo nuevamente la transpuesta pero completa:
        MatrizSimetrica.imprimirMatriz(matrizTraspuesta);
    }
}
