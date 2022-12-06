package class12;

import java.util.Scanner;

public class MoreHomeWorkClass12 {
    ////Write a program to check given number is odd or even using function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to know if it's odd or even");
        int num1 = sc.nextInt();
        Odd(num1);


    }

    static void Odd(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}

