package CH3.test06_2742;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a ;i++){    
            int c = a;      
            c=c-i;
            System.out.println(c);  
        }
    }
}
