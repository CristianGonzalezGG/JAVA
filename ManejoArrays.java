import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManejoArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10]; // Se crea un array de enteros con 10 elementos.

        while (true) {
            // Menú principal
            System.out.println("\nMENU:");
            System.out.println("1. Definición");
            System.out.println("2. Declaración");
            System.out.println("3. Lectura");
            System.out.println("4. Estructura (consola, GUI)");
            System.out.println("5. Asignación");
            System.out.println("6. Búsqueda (secuencial, binaria)");
            System.out.println("7. Actualización (insertar, modificar, borrar)");
            System.out.println("8. Ordenación (burbuja directa o indirecta)");
            System.out.println("9. Terminar");

            System.out.print("Ingrese el número de la opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Definición: Un array es una estructura de datos que almacena elementos del mismo tipo.
                    System.out.println("Definición: Un array es una estructura de datos que almacena elementos del mismo tipo.");
                    break;
                case 2:
                    // Declaración: int[] array = new int[tamaño];
                    System.out.println("Declaración: int[] array = new int[tamaño];");
                    break;
                case 3:
                    // Lectura: Imprimir elementos del array.
                    System.out.println("Lectura: Imprimir elementos del array.");
                    System.out.println("Array actual: " + Arrays.toString(array));
                    break;
                case 4:
                    // Estructura: Implementada en consola.
                    System.out.println("Estructura: Implementada en consola.");
                    break;
                case 5:
                    // Asignación: Asignar valores aleatorios al array.
                    System.out.println("Asignación: Asignar valores aleatorios al array.");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(100); // Valores aleatorios entre 0 y 99
                    }
                    System.out.println("Array actual: " + Arrays.toString(array));
                    break;
                case 6:
                    // Búsqueda:
                    System.out.println("Búsqueda:");
                    System.out.print("Ingrese el número a buscar: ");
                    int numeroBuscado = scanner.nextInt();
                    Arrays.sort(array); // Asegurarse de que el array esté ordenado para búsqueda binaria
                    int indice = Arrays.binarySearch(array, numeroBuscado);
                    if (indice >= 0) {
                        System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + indice + " del array ordenado.");
                    } else {
                        System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
                    }
                    break;
                case 7:
                    // Actualización:
                    System.out.println("Actualización:");
                    System.out.print("Ingrese la posición para modificar: ");
                    int posicionModificar = scanner.nextInt();
                    System.out.print("Ingrese el nuevo valor: ");
                    int nuevoValor = scanner.nextInt();
                    array[posicionModificar] = nuevoValor;
                    System.out.println("Array actualizado: " + Arrays.toString(array));
                    break;
                case 8:
                    // Ordenación: Utilizando el método de ordenación de burbuja.
                    System.out.println("Ordenación: Utilizando el método de ordenación de burbuja.");
                    ordenarBurbuja(array);
                    System.out.println("Array ordenado: " + Arrays.toString(array));
                    break;
                case 9:
                    // Terminar el programa.
                    System.out.println("Terminando el programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    // Opción no válida.
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Método de ordenación de burbuja
    private static void ordenarBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
