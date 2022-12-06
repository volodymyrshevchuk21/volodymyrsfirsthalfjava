package class11;

import java.util.Scanner;

//Print given number in word (0-9)
public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 1 :
                System.out.println("January has 31 days");
            case 2 :
                System.out.println(" February has 28/29 days");
            case 3 :
                System.out.println("March has 31 days");
            case 4:
                System.out.println("April  has 30 days");
            case 5:
                System.out.println("March has 31 days");
            case 6:
                System.out.println("June  has 30 days");
            case 7:
                System.out.println("July  has 31 days");
            case 8:
                System.out.println(" August has 31 day");
            case 9:
                System.out.println("September has 30 days");
            case 10:
                System.out.println("October has 31 days");
            case 11:
                System.out.println("November has 30 days");
            case 12:
                System.out.println("December has 31 days");
            default:
                System.out.println("Please enter number 1-12");


        }

    }
}
