public class ChallengeCinco {
    public static void main(String[] args) {
        // Declaración de un arreglo aleatorio de 12 numeros entre 1 y 6
        int[] a = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 6 + 1);
        }
        // Imprimo los valores de los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        int[] numerosImpresos = new int[a.length];
        int apuntador = 0;
        int cantidad = 0;
        int numero = 0;
        madre:
        for (int i = 0; i < a.length; i++) {
            if (numero != 0) {
                numerosImpresos[apuntador++] = numero;
            }
            numero = a[i];
            for (int j = 0; j < a.length; j++) {
                if (a[j] == numero) {
                    cantidad++;
                }
            }
            // Si el número ya fue impreso, entonces no lo imprimo
            for (int k = 0; k < numerosImpresos.length; k++) {
                if (numerosImpresos[k] == numero) {
                    cantidad = 0;
                    continue madre;
                }
            }

            System.out.print(numero + ":");
            for (int l = 0; l < cantidad; l++) {
                System.out.print("*");
            }
            System.out.println();
            // Finalmente reinicio la cantidad
            cantidad = 0;
        }
    }
}
