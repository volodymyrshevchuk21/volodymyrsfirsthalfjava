package class09;

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your age and weight");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i = 50;
        if(num1>=18&&num2>=50) {
            System.out.println("You are eligible for blood donation");
        }else if (num1<18 && num2<=50) {
            System.out.println("You are too young");
        }else if (num1>=18&&num2<50) {
            System.out.println("You are underweight");
        }else if (num1>18&&num2<50){
            System.out.println("You are uneligible");

        }
    }
}
