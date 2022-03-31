package CH11.test10_18870;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); //좌표size 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int [n];
        int arr2[] = new int [n];
        

        for(int i =0;i<n;i++){
            arr[i] =arr2[i]=Integer.parseInt(st.nextToken());
        }
        //정렬
        Arrays.sort(arr2);
        //해쉬맵
        //중복되지않게 대응 순위 넣어주기
        HashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        int count = 0;       
        for(int i =0;i<n;i++){
            if(!map.containsKey(arr2[i])){ //값이 존재하지않는다면 
                map.put(arr2[i],count);    // 넣어주기
                count++; //다음순위
            }
        }
        for(int i =0;i<n;i++){
            bw.write(map.get(arr[i])+" ");//순위가져오기
        }
        bw.flush();
    }
}
