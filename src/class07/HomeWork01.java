package class07;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if  it's positive,negative or 0");
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("positive");
        }else if(number<0){
            System.out.println("negative");
        }else if(number == 0) {
            System.out.println("zero");



        }
    }
}
