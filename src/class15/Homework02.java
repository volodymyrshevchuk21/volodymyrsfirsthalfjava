package class15;

public class Homework02 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 3; i<=50; i++){
            if(i%3==0||i%5==0){
                sum = sum+i;
            }
        }

        System.out.println(sum);
    }
}
