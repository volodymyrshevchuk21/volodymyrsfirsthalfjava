package class11;

import java.util.Scanner;

public class HomeWorkClass11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to find week day name");
       int day = sc.nextInt();
        switch (day) {
            case 0 :
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter numbers 0 -6");
        }



    }
}
