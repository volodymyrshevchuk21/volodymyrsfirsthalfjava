package class16;
//3.  Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
public class Homework03 {
    public static void main(String[] args) {
        double sum = 0;
        for(double i = 1; i<11;){
            sum = sum + i / ++i;
        }
        System.out.println(sum);
    }
}
