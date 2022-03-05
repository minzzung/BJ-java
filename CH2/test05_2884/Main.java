package CH2.test05_2884;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        if((0<=m)&&(m<45)){
            if(h==0){
                h = 23;
            }
            else{
                h = h-1;
            }
            m=m+15;
                System.out.println(h +" "+ m);           
        }
        else if((45<=m)&&(m<60)){
            m=m-45;
            System.out.println(h +" "+ m);
        }
    }
}
