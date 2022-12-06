package class08;

import java.util.Scanner;

public class HomeWorkClass03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Rating");
        int num1 = sc.nextInt();
        if(num1 == 5) {
            System.out.println("Very good");
        }else if (num1 == 4) {
            System.out.println("Good");
        }else if(num1==3) {
            System.out.println("Averege");
        }else if(num1==2) {
            System.out.println("Poor");
        }else if(num1==1) {
            System.out.println("Very poor");
        }else if   (num1>5|| num1 <=0){
                System.out.println("Error");
            System.out.println("Please use numbers 1-5 only");
            }
        }
    }

