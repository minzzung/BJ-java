package CH9.test01_10872;


import java.util.Scanner;
public class Main {
    static int factorial(int a){
        if((a==0)||(a==1)){
            return 1;
        }
        return a*factorial(a-1);        
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
        
    }
}
