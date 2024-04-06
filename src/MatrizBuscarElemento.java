public class MatrizBuscarElemento {
    public static void main(String[] args) {
        // Declaración de una matriz de 3 filas y 4 columnas
        int[][] matriz = new int[3][4];

        // Asignación de valores a los elementos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Completar con un entero entre 1 y 9 aleatorio usando random
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        // Imprimir la matriz con formato de matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|" + matriz[i][j] + "|\t");
            }
            System.out.println();
        }

        // Buscar un elemento en la matriz
        int elemento = 3;
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elemento) {
                    System.out.println("Elemento encontrado en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento no encontrado");
        }
    }
}
