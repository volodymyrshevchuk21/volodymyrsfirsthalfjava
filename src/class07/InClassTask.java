package class07;

import java.util.Scanner;

public class InClassTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Mark");
        int mark = sc.nextInt();
         if (mark>100) {
             System.out.println("Error");
         }else if(mark>=90) {
            System.out.println("A+");
        }else if(mark>=80) {
            System.out.println("A");
        } else if (mark>=70){
            System.out.println("B+");
        } else if (mark>=60){
            System.out.println("B");
        } else if (mark>=50){
            System.out.println("C+");
        } else if (mark>=40){
            System.out.println("C");
        } else if (mark<=40){
            System.out.println("Error");




        }
    }
}
