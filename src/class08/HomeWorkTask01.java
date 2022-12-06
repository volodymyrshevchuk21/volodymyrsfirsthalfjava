package class08;

import java.util.Scanner;

public class HomeWorkTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please check if number is dividable by 5");
        int num1 = sc.nextInt();
        if(num1 % 5==0) {
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");


        }

    }
}
