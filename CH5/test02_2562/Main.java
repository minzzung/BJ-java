package CH5.test02_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] str) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine()); //숫자 입력받기
			if(max <arr[i]) {
				max = arr[i]; //최댓값구하기
				index = i+1; //최댓값 순번구하기
			}
		}
		
		System.out.println(max);
		System.out.println(index); //
		
        br.close();
	}
}