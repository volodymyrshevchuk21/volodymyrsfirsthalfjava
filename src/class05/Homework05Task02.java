package class05;

import java.util.Scanner;

public class Homework05Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String a = sc.nextLine(), b = sc.nextLine();
        String c = a;

        a=b; b=c;

        System.out.println(a);
        System.out.println(b);
    }

}
