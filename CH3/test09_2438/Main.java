package CH3.test09_2438;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1;i<=a;i++){
            
            for( int p = 1; p <= i; p++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
