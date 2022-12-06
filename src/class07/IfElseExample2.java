package class07;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();

        if (a>=16){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are uneligible");
        }

    }
}


