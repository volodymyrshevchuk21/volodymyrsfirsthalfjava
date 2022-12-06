package class12;

import java.util.Scanner;

//Write a program to take three numbers from user and find reverse of the greatest number (3 digit number)
public class HomeWorkClass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter the third number");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            ThreeDigitsOnlyReversed(num1);
        } else if (num2 > num1 && num2 > num3) {
            ThreeDigitsOnlyReversed(num2);
        } else if (num3 > num1 && num3 > num2) {
           ThreeDigitsOnlyReversed(num3);
        }
        }
    static void ThreeDigitsOnlyReversed(int num1) {
        int lastDigit = 0;
        int ReverseNumber = 0;
        if (num1 >= 100 && num1 <= 999) {
            lastDigit = num1 % 10;
            ReverseNumber = lastDigit;
            num1 = num1 / 10;
            lastDigit = num1 % 10;
            ReverseNumber = ReverseNumber * 10 + lastDigit;
            num1 = num1 / 10;
            ReverseNumber = ReverseNumber * 10 + num1;
            System.out.println("Reverse of the greatest number is " + ReverseNumber);
        } else {
            System.out.println("Please enter three digit numbers only");

        }
    }
}



