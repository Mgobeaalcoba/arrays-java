public class ArreglosAgregarElementoOrdenado {
    public static void main(String[] args) {

            int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
            int elemento = 10;

            // Debo ingresar elemento en el array en orden ascendente y desplazar los elementos mayores a la derecha. El ultimo elemento sale del array. Sin usar un nuevo array
            int i = 0;
            while (i < a.length) {
                if (elemento < a[i]) {
                    int aux = a[i]; // Guardo el valor de a[i] en aux para no perderlo
                    a[i] = elemento; // Ingreso el elemento en la posición i del arreglo
                    elemento = aux; // Guardo el valor de aux en elemento para seguir comparando
                }
                i++;
            }

            // Imprimo los valores del arreglo a
            for (int j = 0; j < a.length; j++) {
                System.out.println("a["+j+"] = " + a[j]);
            }
    }
}
