package class09;

import java.util.Scanner;

public class FindGreatesNumberOutOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Please enter third number");
        int num3= scanner.nextInt();

        if (num1>num2){
            if(num1>num3) {
                System.out.println("Greatest number is "  + num1);

            }

        }



        if (num2>num1){
            if (num2>num3) {
                System.out.println("Greatest number is " + num2);


            }
        }

        if(num3>num2){
            if(num3>num1)
                System.out.println("Greatest number is " + num3);
        }

    }
}
