package CH2.test06_2525;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b;
        if ((m+a)<60){
            m = m + a;
            System.out.println( h + " " + m );
        }
        else if(59<(m+a)){
            b = (m+a)/60;
            a = (m+a)%60;
            h = b + h;
            m = a;
            if(h>23){
                h=h-24;
            }
            System.out.println( h + " " + m );
        }       
    }
}
