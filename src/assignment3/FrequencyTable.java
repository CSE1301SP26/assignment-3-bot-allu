import java.util.Scanner;
import java.util.Random;

public class FrequencyTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of dice:");
        int size = in.nextInt();

        int[] diceRoll = new int[100];
        
        for (int i = 0; i < 100; i++) {
            diceRoll[i] = (int) (Math.random() * 6) + 1;
        }
        
        System.out.println("You rolled: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(diceRoll[i] + " ");
        }
        
        int[] frequency = new int[6]; //6 sides on a dice

        for (int i = 0; i < diceRoll.length; i++) {
            int roll = diceRoll[i];
            frequency [roll - 1]++; // mapping 1-6 to index 0-5
        }

        System.out.println();

        for (int i = 0; i < frequency.length; i++) {
            System.out.print((i + 1) + ": " + frequency[i] + "  ");
        }

        System.out.println();

    }
}
