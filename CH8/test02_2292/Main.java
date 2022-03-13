package CH8.test02_2292;

//쉽지만 방법을 못찾은 문제
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=1;
        int sum = 2;
        if (a ==1){
            System.out.println(1);
        }
        else{
            while(sum<=a){
                sum = sum +(6*count);
                count++;
            }
            System.out.println(count);
        }
        
    }
}
