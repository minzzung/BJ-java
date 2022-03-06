package CH3.test08_11022;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1;i<=a;i++){
            int sum = 0;
            int b = in.nextInt();
            int c = in.nextInt();
            sum=c+b;
            System.out.println("Case #"+i+": "+b+" + "+c +" = "+ sum);
        }
    }
}