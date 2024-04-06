public class MatrizStrings {
    public static void main(String[] args) {
        // Declaración de una matriz de 3x3
        String[][] matriz = new String[3][3];
        // Asignación de nombres masculinos a los elementos de la matriz
        matriz[0][0] = "Juan";
        matriz[0][1] = "Pedro";
        matriz[0][2] = "Carlos";
        // Asignación de nombres femeninos a los elementos de la matriz
        matriz[1][0] = "Ana";
        matriz[1][1] = "María";
        matriz[1][2] = "Laura";
        // Asignación de nombres unisex a los elementos de la matriz
        matriz[2][0] = "Alex";
        matriz[2][1] = "Sam";
        matriz[2][2] = "Taylor";

        // Imprimo los valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz2["+i+"]["+j+"]" + matriz[i][j]);
            }
        }
    }
}
