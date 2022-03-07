package CH4.test01_10952;

import java.util.Scanner;
public class Main {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int a=1;
        int b=1;
        while((a!=0)&&(b!=0)){
            a = in.nextInt();
            b = in.nextInt();
            if((a==0)&&(b==0)){
                break;
            }
            else{
                System.out.println(a+b);
            }
           
            
        }
    }
}
