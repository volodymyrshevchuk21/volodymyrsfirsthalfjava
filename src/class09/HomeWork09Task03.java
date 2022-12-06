package class09;

import java.util.Scanner;

public class HomeWork09Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int num1 = 500;
        int num2 = 100;
        int num3 = 20;
        int num4 = 10;
        int num5 = 5;
        int num6 = 2;
        int num7 = 1;

        if (amount>=num1) {
           //1 How many 500 notes
            System.out.println("U have " + amount / num1 + " 500 notes");
            //2 Save Remainder of amount
            amount = amount%num1;
        }if(amount>=num2){
            System.out.println("U have " + amount / num2 + " 100 notes");
            amount = amount%num2;
        }if(amount>=num3){
            System.out.println("U have " + amount / num3 + " 20 notes");
            amount = amount%num3;
        }if(amount>=num4){
            System.out.println( "U have " + amount / num4 + " 10 notes");
            amount = amount%num4;
        }if(amount>=num5){
            System.out.println( "U have " + amount / num5 + " 5 notes");
            amount = amount%num5;
        }if(amount>=num6){
            System.out.println( "U have " + amount / num6 + " 2 notes");
            amount = amount%num6;
        }if(amount>=num7){
            System.out.println( "U have 1 1 note");



        }
    }
}
