package class18;

import java.util.Scanner;

//important
//write a program to check given number is prime or not
// input 13
public class task2PrimeOrNotPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
            } if(count==2) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");


            }
        }


    }




