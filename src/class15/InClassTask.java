package class15;

import java.util.Scanner;

// write a program to print sum 1 to 5
public class InClassTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;
        for(int i =1; i <=num; i++){
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
