import java.util.*;
public class javabasic {
    public static void Bin(int n){
        int m=n;
        int pow=0;
        int dec=0;
        while(n>0){
            int last = n%10;
            dec=dec+(last*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(m + " Is converted in to ::" + dec);
    }
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Bin(111);
    sc.close();
    }
}