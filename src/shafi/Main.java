package shafi;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyCalculator myCalculator =new MyCalculator();

        System.out.print("Enter a number (at most 100) to get the sum of all its divisors: ");
        Scanner input = new Scanner(System.in);

        int num_for_divisor_sum = input.nextInt();
        int sum = myCalculator.divisorSum(num_for_divisor_sum);
        System.out.println("The sum of divisors of the number "+num_for_divisor_sum+" is: "+sum);

        System.out.println("\n");

        System.out.print("Enter a number (n<=50) to get the factorial value: ");
        int num_for_factorial = input.nextInt();
        BigInteger factorial_value = myCalculator.findFactorial(num_for_factorial);
        System.out.println("The factorial of the number "+ num_for_factorial+" is: "+factorial_value);
    }
}

/*
Name: Md.Abidur Rahman Shafi
ID: 2012020121 (Section: C)
email: cse_2012020121@lus.ac.bd
Date: 16 Oct 2021
 */