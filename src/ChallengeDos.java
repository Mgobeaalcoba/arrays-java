public class ChallengeDos {
    public static void main(String[] args) {
        // Array con siete elementos aleatorios entre 11 a 99 usando random
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 89) + 11;
        }
        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        // Buscar el elemento mayor en el arreglo
        int mayor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        // Imprimo el elemento mayor
        System.out.println("El elemento mayor es " + mayor);
    }
}
