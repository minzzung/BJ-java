package CH9.test02_10870;

import java.util.Scanner;
public class Main {
    static int fibo(int a){
        return (a*(a+1))/2;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));
    }
}
