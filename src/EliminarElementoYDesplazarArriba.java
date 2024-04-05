public class EliminarElementoYDesplazarArriba {
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
        // Eliminar un elemento en el arreglo
        int eliminado = 5;
        int indice = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == eliminado) {
                indice = i;
                break;
            }
        }
        // Desplazar los elementos del arreglo una posición a la izquierda
        if (indice != -1) {
            for (int i = indice; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = 0;
        }
        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
