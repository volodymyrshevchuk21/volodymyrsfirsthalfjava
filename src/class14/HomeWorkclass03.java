package class14;
// Write a program to print 1 10 2 9 3 8 4 7 5 6
public class HomeWorkclass03 {
    public static void main(String[] args) {
        for (int i = 1, j=10; i <= 5; i++, j--) {
            System.out.println(i);
            System.out.println(j);
            j--;


        }
        //another approach
        System.out.println("==================");
        for(int i =1; i <=5; i++){
            System.out.println(i);
            System.out.println(11-i);
        }
    }
}
