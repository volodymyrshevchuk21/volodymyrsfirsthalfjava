package class05;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        //Creating object of Scanner Class
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a+b);

    }
}