package Task_4;

import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a positive number:");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("The sum of numbers from 1 to " + number + " = " + sum);
        }
    }
}
    
