package CH7.test07_2908;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        

        a=Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b=Integer.parseInt(new StringBuilder().append(b).reverse().toString());
        //integer.parseint() :: 숫자형의 문자열을 인자값으로 받으면 해당 값을 int형으로 변환
        //StringBuilder() :: 문자열 저장 및 변경을 위한 메모리 공간을 가지는 클래스이다.
        System.out.println(a>b?a:b);
    }
}
