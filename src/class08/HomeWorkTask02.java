package class08;

import java.util.Scanner;

public class HomeWorkTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your price to find out final bill");
        int num1 = sc.nextInt(); int finalBill =0;
        if(num1 >=10000) {
            finalBill = num1 - (num1 / 100 * 20);
            System.out.println("You get 20% discount: " + finalBill);
        }else if (num1 >=5000) {
            finalBill = num1 - (num1 / 100 * 15);
            System.out.println("You get 15% discount: " + finalBill);
        }else if (num1 >=2000) {
            finalBill = num1 - (num1 / 100 * 10);
            System.out.println("You get 10% discount: " + finalBill);
        }else if (num1 >=1000) {
            finalBill = num1 - (num1 / 100 * 5);
            System.out.println("You get 5% discount: " + finalBill);
        }else {
            finalBill = num1;
            System.out.println("U will get 0%  discount. Your final bill is  "  +  finalBill );
        }
    }
}
