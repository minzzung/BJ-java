package CH11.test07_11651;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][2];


        for(int i = 0;i<a;i++){
            
            arr[i][1] = sc.nextInt();
            arr[i][0] = sc.nextInt();
        }
        //람다함수로 인덱스별 비교
        Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1]; 
			} else {
				return e1[0] - e2[0];
			}
		});


        for(int i = 0;i<a;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);      
        }
    }
}
