import java.util.Arrays;

public class EjemploArreglosString {
    public static void main(String[] args) {
        // Genero un arreglo con productos tecnológicos que voy a imprimir, luego ordenar usando sort() y volver a imprimir
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        // Imprimir los elementos del arreglo
        for (int i = 0; i < productos.length; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }

        // Ordenar el arreglo
        Arrays.sort(productos); // Ordena el arreglo de menor a mayor alfabéticamente

        // Imprimir los elementos del arreglo usando for each
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }

        // Implementar un ciclo for a la inversa
        for (int i = productos.length - 1; i >= 0; i--) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }

        // Otra forma de implementar un ciclo for a la inversa:
        for (int i = 0; i < productos.length; i++) {
            System.out.println("para índice " + (productos.length - 1 - i) + " : " + productos[productos.length - 1 - i]);
        }
    }
}
