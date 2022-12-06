package GroupProject;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {



    /**
     * User will provide two numbers, write a program that finds the result of one number raised to the power of another
     * <p>
     * Example output:
     * Enter the base number: 2
     * Enter the power number: 3
     * Result: 8
     */

    Scanner sc = new Scanner(System.in);
    int base;
    int power;

    // TODO WRITE CODE HERE
        System.out.println("Enter the base number");
        base = sc.nextInt();
        System.out.println("Enter the power number");
        power = sc.nextShort();
        int result = 1;
        for(int i = 1; i<=power; i++){
            result = result*base;
        }
    }

    public static int countPowerOfNums(int base, int power) {
        // TODO IMPLEMENT METHOD
        return -1;
    }
}
