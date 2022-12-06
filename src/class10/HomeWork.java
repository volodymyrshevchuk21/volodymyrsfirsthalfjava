package class10;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num1 = sc.nextInt();
        int lastDigit = 0;
        int reversedNumber = 0;
        if(num1>100&&num1<999) {
            lastDigit = num1 % 10;   // last digit = 567%10=7
            reversedNumber = lastDigit;//assigned value 7 to reversed number
            num1 = num1 / 10; // to seperate last digit from number, now num1 = 56
            lastDigit = num1 % 10; //find 2nd digit
            reversedNumber = reversedNumber *10  + lastDigit;//put 2nd digit into reversed number
            num1 = num1 / 10;//to seperate 2nd digit from num1
            reversedNumber = reversedNumber * 10 + num1;//to put first digit from number  into reversed number023
            System.out.println("Your reversed number is " + reversedNumber);
        }else{
            System.out.println("Please enter 3 digit numbers only");
        }
        }

        }

