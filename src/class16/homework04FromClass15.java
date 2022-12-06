package class16;

import java.util.Scanner;

public class homework04FromClass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
