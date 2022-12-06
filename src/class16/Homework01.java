package class16;

import java.util.Scanner;

//Write a program to print sum of each digits from the given number
//        Input - 43634
//        Output - 20
public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int digit = sc.nextInt();
        int lastDigit = 0;
        while (digit > 0) {
            lastDigit = digit%10; //how to find last digit
            sum = sum + lastDigit;// put last digit into the sum
            digit = digit/10;// to remove the last digit from number, which we already added into the sum

        }
        System.out.println(sum);
    }

}
