package class07;

import java.util.Scanner;

//Write a program
public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("bigger number is" + num1);
        }else{
            System.out.println("bigger number is" + num2);
        }

    }
}
