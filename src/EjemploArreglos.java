public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4]; // Instanciación un arreglo de 4 elementos

        // Si no se inicializa el arreglo, los valores por defecto son ceros
        int i = numeros[0];
        System.out.println("i = " + i);
        int j = numeros[1];
        System.out.println("j = " + j);
        int k = numeros[2];
        System.out.println("k = " + k);
        int l = numeros[3];
        System.out.println("l = " + l);

        // Asignación de valores a los elementos del arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;

        // Imprimir los valores de los elementos del arreglo
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("numeros[2] = " + numeros[2]);
        System.out.println("numeros[3] = " + numeros[3]);


    }
}
