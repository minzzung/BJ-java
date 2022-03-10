package CH5.test04_3052;

import java.util.Scanner;
import java.util.zip.ZipError;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        for(int i = 0;i<=9;i++){
            int a = in.nextInt();
            arr[i] = a % 42;
        }
        for(int z = 0;z<=9;z++){
            for(int j =0;j<=9;j++){
                if(arr[z]!=arr[j]){
                    count=count+1;
                    
                }
            }
        }
        count=count/9;
        if(count == 0){
            System.out.println(1);
        }
        else{
            System.out.println(count);
        }
        
    }    
}
