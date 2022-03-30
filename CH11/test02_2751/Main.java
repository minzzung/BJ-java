package CH11.test02_2751;

//참고
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
        //입력
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
        //sort
		Collections.sort(list);
		
        //출력
		for(int value : list) {
			sb.append(value+"\n");
		}
		System.out.println(sb);
	}
}
