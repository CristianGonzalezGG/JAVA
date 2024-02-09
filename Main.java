import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] VectoTest = new int[10];
        VectoTest[0] = rand.nextInt(100);
        VectoTest[1] = rand.nextInt(100);
        VectoTest[2] = rand.nextInt(100);
        VectoTest[3] = rand.nextInt(100);
        VectoTest[4] = rand.nextInt(100);
        VectoTest[5] = rand.nextInt(100);
        VectoTest[6] = rand.nextInt(100);
        VectoTest[7] = rand.nextInt(100);
        VectoTest[8] = rand.nextInt(100);
        VectoTest[9] = rand.nextInt(100);
        int count = 0;
        do{
            System.out.println("Number: " +count+ "   Random: " +VectoTest[count]);
            count++;


        }while(count < 10);
        int flag = 0;
        int i = 0;
        int DB = rand.nextInt(100);
        do{
            if(DB == VectoTest[i]){
                System.out.println("The number inside on the Array, at the position: "+i);
                i++;
                

            }
        }while(i < 10);
        System.out.println(VectoTest[0]);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Salir");

            // Solicitar la elección al usuario
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la Opción 1");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la Opción 2");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la Opción 3");
                    break;
                case 4:
                    System.out.println("Ha seleccionado la Opción 4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
                    break;
            }

        } while (opcion != 5);

        // Cerrar el escáner al salir
        scanner.close();
    }
}