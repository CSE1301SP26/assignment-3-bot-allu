import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length of array:");
        int size = in.nextInt();
        int[] numList = new int[size];

        System.out.println("Enter your " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numList[i] = in.nextInt(); // is it possible to enter a number and automatically enter to a new line?
        }
        
        System.out.println("Given values: ");
        for (int i = 0; i< size; i++) {
            System.out.print(numList[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numList[j] < numList[j + 1]) {
                    int temp = numList[j]; // temp = 8
                    numList[j] = numList[j + 1]; // numList[j] = 6
                    numList[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numList[i] + " ");
        }

    }
}
