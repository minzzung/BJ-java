package CH3.test11_10871;

import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = 0;i<a;i++){
            int n = in.nextInt();
            if(n<b){
                System.out.print(n+" ");
            }
        }

    }
}
