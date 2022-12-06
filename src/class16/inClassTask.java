package class16;

import java.util.Scanner;

//write a program to print length of given number
//
public class inClassTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}

