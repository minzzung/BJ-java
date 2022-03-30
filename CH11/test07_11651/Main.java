package CH11.test07_11651;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int[a][2];
        int [][] temp =new int [1][2];

        for(int i = 0;i<a;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int j=0;j<a-1;j++){
            for(int k=j+1;k<a;k++){
                if((arr[j][1]-arr[j][0])>(arr[k][1]-arr[k][0])){
                    temp[0][0] = arr[k][0];
                    temp[0][1] = arr[k][1];
                    arr[k][0] = arr[j][0];
                    arr[k][1] = arr[j][1];
                    arr[j][0] = temp[0][0];
                    arr[j][1] =temp[0][1];
                }
            }
        }
        // Arrays.sort(arr, new Comparator<int[]>() {		
        //     @Override
        //     public int compare(int[] e1, int[] e2) {

        //         return (e1[1]-e1[0])-(e2[1]-e2[0]);
        //     }
        // });

        for(int i = 0;i<a;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);      
        }
    }
}
