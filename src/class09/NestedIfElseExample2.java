package class09;

import java.util.Scanner;

public class NestedIfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        int salary = sc.nextInt();
        if (age < 18){
            System.out.println("You are not eligible");
        }else if (salary < 5000) {
            System.out.println("Sorry you need to work harder");
        }else if(salary>=5000){
            System.out.println("Congrats on your credit score");
            if(salary>=20000){
                System.out.println("You get free a credit card");
            }
        }


        }
    }



