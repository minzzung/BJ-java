package CH2.test04_14681;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (0<x){
            if(0<y){
                System.out.println(1);
            }
            else if(0>y){
                System.out.println(4);
            }
        }
        else{
            if(0<y){
                System.out.println(2);
            }
            else if(0>y){
                System.out.println(3);
            }
        }
    }
}
