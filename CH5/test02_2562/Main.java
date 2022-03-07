package CH5.test02_2562;

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int[] arr = new int[9];
//         int max = arr[0];
//         int i = 0;
//         for(;i<9;i++){
//             int a = in.nextInt();
//             arr[i] = a;           
//         }
//         for ( int t=0;t<9;t++){
//             if(max<arr[t]){
//                 max = arr[t];
//             }
//         }
//         System.out.println(max + "\n"+(i-1));   
//     }
// }
import java.io.BufferedReader;
import java.io.InputStreamReader; //InputStreamReader은 기본 반환값이 문자이므로 integer.parseint()로 int형으로 변환시켜준다.
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int[] arr = new int[9];
        for(int i = 0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        int index = 0;
        int count = 0;
        // 배열의 요소를 순차적으로 해당 변수에 대입한다.
        for(int value : arr){
            count++;
            if(value > max){
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}