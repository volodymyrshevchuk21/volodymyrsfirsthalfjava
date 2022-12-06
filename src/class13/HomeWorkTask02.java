package class13;

import java.util.Scanner;

//Write a program to find greatest number out of four numbers using the method
public class HomeWorkTask02 {
    public static void main(String[] args) {
        System.out.println("Please enter 4 numbers to know which one is greater");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("The greatest number is " + Greatest(num1, num2, num3, num4));
    }

    static int Greatest(int num1, int num2, int num3, int num4) {

        int greatestNumber = 0;
        if (num1 > num2 && num1 > num3 & num1 > num4) {
            greatestNumber = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            greatestNumber = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            greatestNumber = num3;
        } else if (num4 > num1 && num4 > num2 && num4 > num3) {
            greatestNumber = num4;

        }
        return greatestNumber;
    }
}