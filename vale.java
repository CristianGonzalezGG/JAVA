import java.util.Scanner;

public class vale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        llenarMatriz(matriz);

        int opcion;
        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar matrices");
            System.out.println("2. Restar matrices");
            System.out.println("3. Multiplicar matriz por escalar");
            System.out.println("4. Multiplicar matrices");
            System.out.println("5. Transponer matriz");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    imprimirMatriz(sumarMatrices(matriz, matriz));
                    break;
                case 2:
                    imprimirMatriz(restarMatrices(matriz, matriz));
                    break;
                case 3:
                    System.out.println("Ingrese el escalar:");
                    int escalar = scanner.nextInt();
                    imprimirMatriz(multiplicarPorEscalar(matriz, escalar));
                    break;
                case 4:
                    int[][] segundaMatriz = new int[10][10];
                    llenarMatriz(segundaMatriz);
                    imprimirMatriz(multiplicarMatrices(matriz, segundaMatriz));
                    break;
                case 5:
                    imprimirMatriz(transponerMatriz(matriz));
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void llenarMatriz(int[][] matriz) {
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor++;
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    private static int[][] restarMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }

    private static int[][] multiplicarPorEscalar(int[][] matriz, int escalar) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    private static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    private static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }
}
