public class ArregloOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10]; // Instanciación un arreglo de 10 elementos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        } // Asignación de valores a los elementos del arreglo

        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // Imprimo el primero con el último y así sucesivamente
        int largo = numeros.length;
        for (int i = 0; i < largo / 2; i++) {
            System.out.println(numeros[i] + " -- " + numeros[largo - 1 - i]);
        }

        // Creo un nuevo arreglo y lo cargo con los datos intercalados
        int[] numeros2 = new int[10];
        for (int i = 0; i < largo / 2; i++) {
            numeros2[i * 2] = numeros[i];
            numeros2[i * 2 + 1] = numeros[largo - 1 - i];
        }

        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("numeros2[" + i + "] = " + numeros2[i]);
        }
    }
}
