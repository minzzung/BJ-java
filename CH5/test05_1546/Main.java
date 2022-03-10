package CH5.test05_1546;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        int sum = 0;
        for(int i = 0;i<a;i++){
            int n = in.nextInt();
            arr[i]=n;
        }
        for(int j = 0;j<a;j++){
            
        }
        double sum2 = (double)sum;
        System.out.println(sum2/a);
    }
}
