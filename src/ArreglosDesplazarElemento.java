public class ArreglosDesplazarElemento {
    public static void main(String[] args) {

            int[] a = {1, 2, 3, 4, 5};
            int[] b = new int[a.length];

            // Imprimo los valores del arreglo a
            for (int i = 0; i < a.length; i++) {
                System.out.println("a["+i+"] = " + a[i]);
            }

            // Desplazo los elementos del arreglo a una posición a la derecha
            int aux = a[a.length-1];
            for (int i = 0; i < a.length; i++) {
                b[(i+1) % a.length] = a[i]; // (i+1) % a.length es para que el índice no se salga del rango. Cuando i = a.length-1, (i+1) % a.length = 0
            }
            b[0] = aux;

            // Imprimo los valores del arreglo b
            for (int i = 0; i < b.length; i++) {
                System.out.println("b["+i+"] = " + b[i]);
            }
    }
}
