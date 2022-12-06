package class13;

import java.util.Scanner;

public class HomeWorkTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius");
        double tempCel = sc.nextDouble();
        System.out.println("Temperature in Farenheits is " + Convertation(tempCel));
    }







        static double Convertation(double tempCel){
        double temFar = (tempCel * 1.8 + 32);
        return temFar;

        }
    }


