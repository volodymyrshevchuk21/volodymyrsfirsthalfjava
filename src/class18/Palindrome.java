package class18;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        int rev = 0;
        int lastDigit = 0;
        int OriginalNum = num;
        while (num!=0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        if(OriginalNum == rev) {
            System.out.println("Palindrome");
        }else{
            System.out.println(" Not Palindrome");


            }
        }
    }
