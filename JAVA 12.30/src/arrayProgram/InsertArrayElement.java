package arrayProgram;
import java.util.Scanner;

public class InsertArrayElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("Enter the index where you want to insert the element: ");
        int index = scan.nextInt();
        System.out.println("Enter the element you want to insert: ");
        int element = scan.nextInt();
        int[] result = insertAtIndex(numbers, index, element);
        System.out.println("Array after inserting the element: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static int[] insertAtIndex(int[] numbers, int index, int element) {
        int[] result = new int[numbers.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = numbers[i];
        }
        result[index] = element;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = numbers[i - 1];
        }
        return result;
    }
	

}
