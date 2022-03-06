package CH3.test10_2439;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1;i<=a;i++){
            for ( int p = 1; p <= a-i; p++){
                System.out.print(" ");
            }
            for( int p = 1; p <= i; p++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}