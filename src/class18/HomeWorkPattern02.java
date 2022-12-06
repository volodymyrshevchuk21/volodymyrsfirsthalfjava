package class18;
//
public class HomeWorkPattern02 {
   public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
           for (int s = 1; s <=i-1; s++) {
                System.out.print(" ");
            }
           for (int j = 1; j <= 11-2*i; j++) {
                System.out.print(j);

        }        System.out.println();
       }
    }
}
