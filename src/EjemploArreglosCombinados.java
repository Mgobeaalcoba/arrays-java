public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c, d, e;
        a = new int[10];
        b = new int[10];
        c = new int[20];
        d = new int[20];
        e = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1) * 5;
        }

        // Completo el arreglo c con los valores de los arreglos a y b de a 1 por ciclo
        int aux = 0;
        for (int i = 0; i < b.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        // Completo el arreglo d con los valores de los arreglos a y b de a 2 por ciclo
        aux = 0;
        for (int i = 0; i < b.length; i+=2) {
            for (int j = 0; j < 2; j++) {
                d[aux++] = a[i+j];
            }
            for (int j = 0; j < 2; j++) {
                d[aux++] = b[i+j];
            }
        }

        // Completo el arreglo e con los valores de los arreglos a y b de a 5 por ciclo
        aux = 0;
        for (int i = 0; i < b.length; i+=5) {
            for (int j = 0; j < 5; j++) {
                e[aux++] = a[i+j];
            }
            for (int j = 0; j < 5; j++) {
                e[aux++] = b[i+j];
            }
        }

        // Imprimo los valores de los elementos del arreglo c
        for (int i = 0; i < c.length; i++) {
            System.out.println("c["+i+"] = " + c[i]);
        }

        // Imprimo los valores de los elementos del arreglo d
        for (int i = 0; i < d.length; i++) {
            System.out.println("d["+i+"] = " + d[i]);
        }

        // Imprimo los valores de los elementos del arreglo e
        for (int i = 0; i < e.length; i++) {
            System.out.println("e["+i+"] = " + e[i]);
        }
    }
}
