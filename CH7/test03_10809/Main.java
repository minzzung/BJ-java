package CH7.test03_10809;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int[] arr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        for(int j = 0;j<str.length();j++){
            char ch = str.charAt(j);
            if(arr[ch-'a']==-1){ 
                arr[ch-'a'] = j; 
            }

        }
        for(int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
