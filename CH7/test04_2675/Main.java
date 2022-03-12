package CH7.test04_2675;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        for ( int i =0; i<a;i++){

            int b = in.nextInt();
            String str = in.next();

            // char arr[] = new char[b];
            // for( int j =0;j<str.length();j++){
            //     char ch = str.charAt(j);
            //     arr[j] = ch;
            // }

            for(int k = 0;k<str.length();k++){
                for(int u=0;u<b;u++){
                    System.out.print(str.charAt(k));
                }
            }
            System.out.println();
        }
    }
}
