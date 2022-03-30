package CH11.test06_11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int[a][2];

        for(int i = 0;i<a;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        //람다식을 통한 배열 비교
        //Arrays.sort()에 람다식(=익명함수) 사용하는 방법
       //  sort는 두가지 인자를 받을 수 있다.
       //  sort의 첫 번째는 제너릭타입(T[])어떤타입에 상관없이 배열의 형태로 받을 수 있다.
       //  sort의 두 번째는 Comparator<?[]>. 상속관계에 있는 타입만 자료형으로 받겠다는 의미.
        Arrays.sort(arr, new Comparator<int[]>() {		
            @Override
            public int compare(int[] e1, int[] e2) {
                if(e1[0] == e2[0]) {		//첫 번째 원소가 같다면
                    return e1[1] - e2[1];   //두 번째 원소 비교
                }
                else {
                    return e1[0] - e2[0];  //같지않다면 첫 번째 원소만 비교
                }
            }
        });

        for(int i = 0;i<a;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);      
        }
    }

}
