package CH4.test03_1110;

import java.util.Scanner;
public class Main {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int a = 1;
        int b =1;
        while((0<a)&&(b<10)){
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a+b);
        }
    }
}
