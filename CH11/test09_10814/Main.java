package CH11.test09_10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       int count = sc.nextInt();
       String arr[][] = new String [count][2];

       for(int i=0;i<count;i++){
           arr[i][0] =sc.next();
           arr[i][1] =sc.next();
       }

       //Arrays.sort()에 람다식(=익명함수) 사용하는 방법
       //  sort는 두가지 인자를 받을 수 있다.
       //  sort의 첫 번째는 제너릭타입(T[])어떤타입에 상관없이 배열의 형태로 받을 수 있다.
       //  sort의 두 번째는 Comparator<?[]>. 상속관계에 있는 타입만 자료형으로 받겠다는 의미.
       Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        
        });

       for(int i =0;i<count;i++){
           System.out.println(arr[i][0]+" "+arr[i][1]);
       }

    }
    public static class Person {
        int ages;
        String name;
    }
    
}
