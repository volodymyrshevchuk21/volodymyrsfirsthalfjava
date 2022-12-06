package class16;

import java.util.Scanner;

public class oneMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit = 0;
        int max = num % 10;
        while (num != 0) {
            int lasDigit = num % 10;
            if(max<lastDigit){
                max = lastDigit;
            }
        }
    }
}
