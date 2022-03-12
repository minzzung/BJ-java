package CH7.test05_1157;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        int a =-1;
        char ch = '?';
        for (int i =0;i<str.length();i++){
            if(65<=str.charAt(i)&& str.charAt(i)<=90){
                arr[str.charAt(i) - 'A']++;
            }
            else{
                arr[str.charAt(i) - 'a']++;
            }
            
        }
        for(int j=0;j<26;j++){
            if(arr[j]>a){
                a=arr[j];
                ch = (char)(j+65);
            }
            else if(arr[j]==a){
                ch = '?';
            }
        }
        System.out.println(ch);
    }

    
}
    

