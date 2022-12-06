package class09;

import java.util.Scanner;

public class homeWork09Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units to know how much you need to pay");
        double unit = sc.nextDouble();
        if(unit<=200) {
                System.out.println("You need to pay " + (unit * 0.50));
        }else if (unit>=201 && unit<=400) {
            System.out.println("You need to pay "  + (unit * 0.65 + 100));
        }else if(unit>=401 && unit <=600)
            System.out.println("You need to pay "  + (unit * 0.80 + 230));

        else{
            System.out.println("Please enter correct numbers");


        }

    }
}
