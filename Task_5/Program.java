package Task_5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueExecution = true;

            while (continueExecution) {
                System.out.println("Enter the first number:");
                int num1 = scanner.nextInt();

                System.out.println("Enter the second number:");
                int num2 = scanner.nextInt();

                int result = num1 * num2;
                System.out.println("The result of multiplication: " + result);

                System.out.println("To finish, enter 1, to continue, enter any other number:");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    continueExecution = false;
                }
            }
        }
        System.out.println("The program has completed execution.");
    }
}
