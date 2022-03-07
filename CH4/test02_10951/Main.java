package CH4.test02_10951;
//EoF(End of File) :: 파일의 끝. 즉 더 이상 읽을 데이터가 없는 것을 나타내는 단어이다.
import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1+num2);
        }
    }
}
