public class test {
    static int matriz [][];
    static int inF ;
    static int finF;
    static int inC;
    static int finC;
    public static void snail(){
        matriz = new int [10][10];
        int value = 1;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = value++;
            }
        }
    }
    public static void eje(){
        inF = 0;
        finF = 9;
        inC = 0;
        finC = 9;
        int sumaFilas = 0;
        while (inF <= finF && inC <= finC) {
        for( int i = inF; i <= finF; i++){
            sumaFilas += matriz[i][inC];
            System.out.println(matriz[i][inC]);
            
        }
        System.out.println("Suma de la fila: " + sumaFilas);
        inC++;
        for(int j = inC; j <= finC;j++){
            System.out.println(matriz[finF][j]);
        }
        finF--;
        for(int i = finF; i >= inF; i--){
            System.out.println(matriz[i][finC]);
        }
        finC--;
        for(int j = finC; j >= inC; j--){
            System.out.println(matriz[inF][j]);
        }
        inF++;
        
    }
    System.out.println(sumaFilas);
}
    
    public static void main(String[] args) {
        snail();
        eje();
    }
}
