package class16;

import java.util.Scanner;

//Write a program to find factors of the given number
public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        int i,count = 0;
      for(i =1; i<=num;i++){
          if(num%i==0){
              count++;
              System.out.println(i);

            }
        }

    }
}
