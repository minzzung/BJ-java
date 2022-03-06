package CH3.test07_11021;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1;i<=a;i++){
            int b = in.nextInt();
            int c = in.nextInt();
            b=c+b;
            System.out.println("Case #"+i+": " + b);
        }
    }
}
