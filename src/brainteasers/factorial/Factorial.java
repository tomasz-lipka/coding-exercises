package brainteasers.factorial;

import java.util.Scanner;

/**
 * Exercise:
 * Implement a method which calculates the factorial of a given number.
 * Example:
 * 1! = 1
 * 2! = 1*2 =2
 * 3! = 1*2*3 = 6
 */
public class Factorial {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            String s = scanner.nextLine();
            try {
                number = Integer.parseInt(s);
                if (number > 12 || number < 0) {
                    System.out.println("Number must be in range from 0 to 12");
                    continue;
                }
                scanner.close();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not integer");
            }
        }

        int result = new Factorial().factorial(number);
        System.out.printf("Factorial of %s is %s\n", number, result);
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
