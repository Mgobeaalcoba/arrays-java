import java.util.Comparator;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        // Ejemplo de ordenamiento burbuja
        String[] productos2 = new String[7];
        productos2[0] = "Kingston Pendrive 64GB";
        productos2[1] = "Samsung Galaxy";
        productos2[2] = "Disco Duro SSD Samsung Externo";
        productos2[3] = "Asus Notebook";
        productos2[4] = "Macbook air";
        productos2[5] = "Chromecast 4ta generación";
        productos2[6] = "Bicicleta Oxford";

        Integer[] numeros = { 10, 5, 7, 2, 1 };

        // String[] productos3 = productos2.clone();

        imprimirArray(numeros);

        ordenamientoBurbuja(numeros);

        imprimirArray(numeros);

        System.out.println(" ... Cambio de a un ordenamiento burbuja optimizado ... " );

        imprimirArray(productos2);

        ordenamientoBurbujaOptimizado(productos2);

        imprimirArray(productos2);


    }

    public static void imprimirArray(Object[] productos2) {
        // Imprimir los elementos del arreglo
        for (int i = 0; i < productos2.length; i++) {
            System.out.println("para índice " + i + " : " + productos2[i]);
        }
    }

    public static <T extends Comparable<T>> void ordenamientoBurbuja(T[] arreglo) {
        int total = arreglo.length;
        // Ordenar el arreglo con el método burbuja
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) { // Si el elemento actual es mayor al siguiente. compareTo() compara dos cadenas de texto y devuelve un número negativo si la primera es menor que la segunda, 0 si son iguales y un número positivo si la primera es mayor que la segunda
                    T aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    // Ordenamiento burbuja optimizado
    public static <T extends Comparable<T>> void ordenamientoBurbujaOptimizado(T[] arreglo) {
        // Ordenar el arreglo con el método burbuja
        int total = arreglo.length;
        boolean flag = false;
        int i = 0;
        while (i < total - 1) {
            flag = false;
            for (int j = 0; j < total - 1 - i; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) { // Si el elemento actual es mayor al siguiente. compareTo() compara dos cadenas de texto y devuelve un número negativo si la primera es menor que la segunda, 0 si son iguales y un número positivo si la primera es mayor que la segunda
                    T aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
    }
}
