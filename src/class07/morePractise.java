package class07;

import java.util.Scanner;

//Write a program to print day name based on day of week
public class morePractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whats the day name based on day of week");
        int day = sc.nextInt();
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else{
            System.out.println("Please enter numbers 0-6");


            }
        }


        }

