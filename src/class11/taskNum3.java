package class11;

import java.util.Scanner;

public class taskNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        System.out.println("Please enter first number:");

        int num2 = sc.nextInt();
        System.out.println("Please enter second number:");

        String operation = sc.next();
        System.out.println("Please enter operator ");

        switch (operation.toLowerCase()) {
            case "add":
            case"+":
                System.out.println(num1 + num2);
                break;
            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;
            case "mul":
            case"*":
                System.out.println(num1 * num2);
                break;
            case "div":
            case"/":
                System.out.println(num1 / num2);
                break;
            case "modulo":
            case "%":
                System.out.println(num1 % num2);
                System.out.println("Invalid process");


        }

    }
}
