import java.util.Scanner;

/**
 * Created by jc247746 on 22/08/16.
 */
public class EvenEntryLoop {
    public static void main(String[] args) {
        final int SENTINEL;
        int userInput;
        SENTINEL = 999;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        userInput = scanner.nextInt();

        while (userInput != SENTINEL) {
            if (userInput % 2 == 0) {
                System.out.println("Good job!");
                System.out.println("Enter another even number: ");
                userInput = scanner.nextInt();
            } else {
                System.out.println("Please enter an EVEN number: ");
                userInput = scanner.nextInt();
            }
        }
    }
}
