import java.util.Scanner;

/**
 * Created by jc247746 on 22/08/16.
 */
public class Inbetween {
    public static void main(String[] args) {
        int firstInput;
        int secondInput;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low number: ");
        firstInput = scanner.nextInt();
        System.out.println("Enter high number: ");
        secondInput = scanner.nextInt();

        while (firstInput > secondInput) {
            System.out.println("Low number is higher than high number");
            System.out.println("Enter low number: ");
            firstInput = scanner.nextInt();
            System.out.println("Enter high number: ");
            secondInput = scanner.nextInt();
        }

        number = firstInput;
        while (number <= secondInput) {
            System.out.println(number + " ");
            number += 1;
        }

    }
}
