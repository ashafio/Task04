package shafi;
import java.math.BigInteger;

    public class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisorSum(int num) {
            int result = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    result = result + i;
                }
            }
            return result;
        }

        @Override
        public BigInteger findFactorial(int num) {
            BigInteger fact = BigInteger.ONE;
            for (int i = 1; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            return fact;
        }
    }

/*
Name: Md.Abidur Rahman Shafi
ID: 2012020121 (Section: C)
email: cse_2012020121@lus.ac.bd
Date: 16 Oct 2021
 */

