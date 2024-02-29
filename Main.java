import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = null; // Array of integers initially null.
        int flagDeclaration = 0; // Flag for array declaration
        int flagDefinition = 0; // Flag for array definition

        // Display the main menu
        String menu = "MENU:\n1. Declaration\n2. Definition\n3. Access (traverse the Array)\n4. Assignment\n5. Reading\n6. Search (sequential, binary)\n7. Update (insert, modify, delete)\n8. Sorting (direct or indirect bubble)\n9. Exit";

        while (true) {
            // Main menu
            String input = JOptionPane.showInputDialog(null, menu + "\nEnter the option number:");
            int option = Integer.parseInt(input);

            switch (option) {
                case 1:
                    // Declaration of array
                    if (flagDeclaration == 0) {
                        String lengthInput = JOptionPane.showInputDialog(null, "Enter the length of the array:");
                        int length = Integer.parseInt(lengthInput);
                        array = new int[length];
                        JOptionPane.showMessageDialog(null, "The array has been declared with a length of: " + length);
                        flagDeclaration = 1; // Set flag to indicate array declaration
                    } else {
                        JOptionPane.showMessageDialog(null, "Array already declared.");
                    }
                    break;

                case 2:
                    // Definition of array elements
                    if (flagDeclaration == 1 && flagDefinition == 0) {
                        for (int i = 0; i < array.length; i++) {
                            String elementInput = JOptionPane.showInputDialog(null, "Enter the element " + i + ":");
                            array[i] = Integer.parseInt(elementInput);
                        }
                        JOptionPane.showMessageDialog(null, "Array elements defined.");
                        flagDefinition = 1; // Set flag to indicate array definition
                    } else if (flagDeclaration == 0) {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Array elements already defined.");
                    }
                    break;

                case 3:
                    // Access (traverse the array)
                    if (flagDeclaration == 1) {
                        StringBuilder arrayElements = new StringBuilder("Array elements:\n");
                        for (int i = 0; i < array.length; i++) {
                            // Iterate through array values and append each element
                            arrayElements.append("Element ").append(i).append(": ").append(array[i]).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, arrayElements.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    }
                    break;

                case 4:
                    // Assignment of a specific value in the array
                    if (flagDeclaration == 1) {
                        String indexInput = JOptionPane.showInputDialog(null, "Enter the index of the element to assign:");
                        int index = Integer.parseInt(indexInput);
                        if (index >= 0 && index < array.length) {
                            String valueInput = JOptionPane.showInputDialog(null, "Enter the value to assign:");
                            int value = Integer.parseInt(valueInput);
                            array[index] = value;
                            JOptionPane.showMessageDialog(null, "Value assigned correctly.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Index out of range.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    }
                    break;

                case 5:
                    // Reading a specific value in the array
                    if (flagDeclaration == 1) {
                        String readIndexInput = JOptionPane.showInputDialog(null, "Enter the index of the element to read:");
                        int readIndex = Integer.parseInt(readIndexInput);
                        if (readIndex >= 0 && readIndex < array.length) {
                            JOptionPane.showMessageDialog(null, "The value at index " + readIndex + " is: " + array[readIndex]);
                        } else {
                            JOptionPane.showMessageDialog(null, "Index out of range of the array.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    }
                    break;

                case 6:
                    // Search
                    if (flagDeclaration == 1) {
                        String numberToSearchInput = JOptionPane.showInputDialog(null, "Enter the number to search:");
                        int numberToSearch = Integer.parseInt(numberToSearchInput);
                        Arrays.sort(array); // Ensure that the array is sorted for binary search
                        int searchIndex = Arrays.binarySearch(array, numberToSearch);
                        if (searchIndex >= 0) {
                            JOptionPane.showMessageDialog(null, "The number " + numberToSearch + " is at position " + searchIndex + " in the sorted array.");
                        } else {
                            JOptionPane.showMessageDialog(null, "The number " + numberToSearch + " is not in the array.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    }
                    break;

                case 7:
                    // Update (insert, modify, delete)
                    if (flagDeclaration == 1 && flagDefinition == 1) {
                        String option1Input = JOptionPane.showInputDialog(null, "\n7. Update (insert, modify, delete)\n1. Modify\n2. Delete");
                        int option1 = Integer.parseInt(option1Input);
                        switch (option1) {
                            case 1:
                                // Modify
                                String modifyPositionInput = JOptionPane.showInputDialog(null, "Enter the position to modify:");
                                int modifyPosition = Integer.parseInt(modifyPositionInput);
                                if (modifyPosition >= 0 && modifyPosition < array.length) {
                                    String newValueInput = JOptionPane.showInputDialog(null, "Enter the new value:");
                                    int newValue = Integer.parseInt(newValueInput);
                                    array[modifyPosition] = newValue;
                                    JOptionPane.showMessageDialog(null, "Array updated: " + Arrays.toString(array));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Position out of range of the array.");
                                }
                                break;

                            case 2:
                                // Delete
                                String deletePositionInput = JOptionPane.showInputDialog(null, "Enter the position to delete:");
                                int deletePosition = Integer.parseInt(deletePositionInput);
                                if (deletePosition >= 0 && deletePosition < array.length) {
                                    array[deletePosition] = 0; // Assigning 0 to simulate deletion
                                    JOptionPane.showMessageDialog(null, "Element at position " + deletePosition + " deleted.\nArray updated: " + Arrays.toString(array));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Position out of range of the array.");
                                }
                                break;
                        }
                    } else if (flagDeclaration == 0) {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    } else {
                        JOptionPane.showMessageDialog(null, "You must define array elements first.");
                    }
                    break;

                case 8:
                    // Sorting: Using the bubble sort method
                    if (flagDeclaration == 1 && flagDefinition == 1) {
                        JOptionPane.showMessageDialog(null, "Sorting: Using the bubble sort method.");
                        bubbleSort(array);
                        JOptionPane.showMessageDialog(null, "Sorted array: " + Arrays.toString(array));
                    } else if (flagDeclaration == 0) {
                        JOptionPane.showMessageDialog(null, "You must declare the array first.");
                    } else {
                        JOptionPane.showMessageDialog(null, "You must define array elements first.");
                    }
                    break;

                case 9:
                    // Exit the program
                    JOptionPane.showMessageDialog(null, "Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    // Invalid option
                    JOptionPane.showMessageDialog(null, "Invalid option. Try again.");
            }
        }
    }

    // Bubble sort method
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
