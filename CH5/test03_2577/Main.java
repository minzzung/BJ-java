package CH5.test03_2577;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = (in.nextInt()*in.nextInt()*in.nextInt());
        String str = Integer.toString(sum);
        in.close();
        
        for(int i =0;i<=9;i++){
            int count = 0;
            for(int j = 0;j<=9;j++){
                if((str.charAt(j)-'0'==i)){
                    count=count+1;
                }
            }
            System.out.println(count);
        }
    }
}
