import java.util.Arrays;

public class BusquedaBinaria {

    public static void main(String[] args) {
        int[] listaOrdenada = {10,1,5,9,2,4,3,6,7,8};
        int elementoBuscado = 1;

        // Antes de realizar la búsqueda binaria, es crucial ordenar la lista
        Arrays.sort(listaOrdenada);

        // Llamada a la función de búsqueda binaria
        int posicion = busquedaBinaria(listaOrdenada, elementoBuscado);
        

        if (posicion != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + posicion + " de la lista ordenada.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en la lista.");
        }
    }

    // Función de búsqueda binaria
    private static int busquedaBinaria(int[] lista, int objetivo) {
        int inicio = 0;
        int fin = lista.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Se encuentra el elemento en el medio
            if (lista[medio] == objetivo) {
                return medio;
            }

            // Si el objetivo es menor, buscar en la mitad inferior
            if (lista[medio] > objetivo) {
                fin = medio - 1;
            }

            // Si el objetivo es mayor, buscar en la mitad superior
            else {
                inicio = medio + 1;
            }
        }

        // Si el elemento no está presente en la lista
        return -1;
    }
}
