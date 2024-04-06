public class AgregarElementoEnUnArregloMasGrande {
    public static void main(String[] args) {
        // Agregar un elemento en una posición indicada y mover los siguientes elementos una posición a la derecha en un arreglo más grande
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length + 1];
        int elemento = 10;
        int posicion = 2;

        // Imprimo los valores del arreglo a
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // Agregar un elemento en una posición indicada y mover los siguientes elementos una posición a la derecha en un arreglo más grande
        for (int i = 0; i < b.length; i++) {
            if (i < posicion) {
                b[i] = a[i];
            } else if (i == posicion) {
                b[i] = elemento;
            } else {
                b[i] = a[i - 1];
            }
        }

        // Imprimo los valores del arreglo b
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}
