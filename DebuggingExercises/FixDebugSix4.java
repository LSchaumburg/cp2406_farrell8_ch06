// DebugSix4.java
// Displays 5 random numbers between 
// (and including) user-specified values

import java.util.Random;
import java.util.Scanner;

public class FixDebugSix4 {
    public static void main(String[] args) {
        int high, low, count;
        final int NUM = 5;
        Random rand = new Random();
        count = 0;
        Scanner input = new Scanner(System.in);
        // Prompt user to enter high and low values
        System.out.print("This application displays " + NUM +
                " random numbers" +
                "\nbetween the low and high values you enter" +
                "\nEnter low value now... ");
        low = input.nextInt();
        System.out.print("Enter high value... ");
        high = input.nextInt();
        while (low == high) {
            System.out.println("The number you entered for a high number, " +
                    high + ", is not more than " + low);
            System.out.print("Enter a number higher than " + low + "... ");
            high = input.nextInt();
        }

        while (count < NUM) {
            double result = rand.nextInt(high) + 1;
            // random() returns value between 0 and 1
            int answer = (int) (result * 10 + low);
            // multiply by 10 and add low -- random is at least the value of low
            // only use answer if it is low enough
            if (answer <= high) {
                System.out.print(answer + " ");
                ++count;
            }
        }
        System.out.println();
    }
}
