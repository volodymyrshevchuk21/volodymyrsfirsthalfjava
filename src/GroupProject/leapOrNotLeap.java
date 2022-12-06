package GroupProject;

import java.util.Scanner;

public class leapOrNotLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startYear;
        int endYear;
        System.out.println("Enter first year");
        startYear = sc.nextInt();
        System.out.println("Enter second year");
        endYear = sc.nextInt();
countLeapYearBetweenYears(startYear, endYear);
        // TODO WRITE YOUR CODE HERE
    }


    public static void countLeapYearBetweenYears(int startYear, int endYear) {
        int count = 0;
        for(int i = startYear; i <endYear; i++) {
            if(i %4 ==0){
                count = i;
                System.out.println(i);
        }

        }
    }
}


