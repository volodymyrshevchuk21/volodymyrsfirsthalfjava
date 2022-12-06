package GroupProject;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number:
         * 5
         * Factorial result: 120
         */

        // TODO write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long number = sc.nextLong();
        //Factorial factorial = new Factorial ();
        //factorial.calculate(number);
    }

        public static void calculate ( long number){
            // TODO IMPLEMENT METHOD
long factorial = 1;
for( long i = 1; i <= number; i++){
    factorial = factorial*i;
        }
            System.out.println(factorial);
    }
}
