public class MainTest {
    static int matriz[][];
    static int inF, finF, inC, finC;

    public static void snail() {
        matriz = new int[10][10];
        int value = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = value++;
            }
        }
    }

    public static void eje() {
        inF = 0;
        finF = 9;
        inC = 0;
        finC = 9;
    
        while (inF <= finF && inC <= finC) {
            int sumaFilas = 0; // Initialize sumaFilas for each row
    
            // Print the elements of the current row
            for (int j = inC; j <= finC; j++) {
                sumaFilas += matriz[inF][j];
                System.out.println(matriz[inF][j]);
            }
            System.out.println("Suma de la fila: " + sumaFilas); // Print the sum for the current row
            sumaFilas = 0;
            inF++;
    
            // Print right column
            for (int i = inF; i <= finF; i++) {
                sumaFilas += matriz[i][finC];
                System.out.println(matriz[i][finC]);
            }
            System.out.println("Suma de la columna: " + sumaFilas); // Print the sum for the current column
            sumaFilas = 0;
            finC--;
    
            // Print bottom row
            if (inF <= finF) {
                for (int j = finC; j >= inC; j--) {
                    sumaFilas += matriz[finF][j];
                    System.out.println(matriz[finF][j]);
                }
                System.out.println("Suma de la fila: " + sumaFilas); // Print the sum for the current row
                sumaFilas = 0;
                finF--;
            }
    
            // Print left column
            if (inC <= finC) {
                for (int i = finF; i >= inF; i--) {
                    sumaFilas += matriz[i][inC];
                    System.out.println(matriz[i][inC]);
                }
                System.out.println("Suma de la columna: " + sumaFilas); // Print the sum for the current column
                sumaFilas = 0;
                inC++;
            }
        }
    }
    
    public static void main(String[] args) {
        snail();
        eje();
    }
}
