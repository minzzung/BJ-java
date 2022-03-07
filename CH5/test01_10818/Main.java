package CH5.test01_10818;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            int a = in.nextInt();
            arr[i]=a;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
