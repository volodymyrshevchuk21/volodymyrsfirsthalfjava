package class05;
//swap value of two variables
public class SwapNumbers {
    public static void main(String[] args){
        System.out.println("===============1===============");
        int a = 10, b = 20, c = a;
        a=b; b=c;

        System.out.println(a);
        System.out.println(b);
        System.out.println("================2==============");

        int i = 10;
        int j = 20;
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println(i);
        System.out.println(j);
}
}
