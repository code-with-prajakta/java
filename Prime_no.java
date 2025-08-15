package prime_no;

import java.util.Scanner;

public class Prime_no{
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Check for prime
        if (number <= 1) {
            isPrime = false;  // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print result
        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

        // Close scanner
        scanner.close();
    }
}
