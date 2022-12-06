package class08;

import java.util.Scanner;

public class HomeWorkClass04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter to know if it is vowel or not");
        char char1 = sc.next().charAt(0);
        if(char1=='a'|| char1 == 'e'||char1=='i'||char1=='o'||char1 =='u') {
            System.out.println("Letter you entered" + char1 + " is vowel ");
        }else
            System.out.println("not vowel");
        }
    }
