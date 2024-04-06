public class ArreglosBuscarElementos {
    public static void main(String[] args) {
        // Declaración de un arreglo de 10 elementos
        int[] a = new int[10];
        // Asignación de valores a los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        // Buscar un elemento en el arreglo
        int buscado = 5;
        int indice = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == buscado) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("El elemento " + buscado + " se encuentra en la posición " + indice);
        } else {
            System.out.println("El elemento " + buscado + " no se encuentra en el arreglo");
        }
    }
}
