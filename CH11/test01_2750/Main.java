package CH11.test01_2750;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int [a];
        for(int i = 0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        for(int k = 0;k<a-1;k++){    //a-1 비교범위
            int temp;      
            for(int j =k+1;j<a;j++){
                if(arr[k]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int m= 0;m<a;m++){
            System.out.println(arr[m]);
        }
        
    }
}
