public class ChallengeCuatro {
    public static void main(String[] args) {
        // Creo un arreglo aleatorio de 10 elementos entre 1 y 9 usando random
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9) + 1;
        }
        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        // Buscar el elemento que mas se repite y la cantidad de veces que se repite
        int masRepetido = 0;
        int cantidad = 0;
        for (int i = 0; i < a.length; i++) {
            int contador = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    contador++;
                } // Si el contador es mayor a la cantidad, entonces el elemento mas repetido es el actual
            }
            if (contador > cantidad) {
                masRepetido = a[i];
                cantidad = contador;
            } // Al final imprimo el elemento mas repetido y la cantidad de veces que se repite
        }
        System.out.println("La mayor ocurrencias es: " + cantidad);
        System.out.println("El elemento que mas se repite es: " + masRepetido);
    }
}
