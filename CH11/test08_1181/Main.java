package CH11.test08_1181;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String []arr = new String [count];

        for(int i = 0;i<count;i++){
            arr[i] = sc.nextLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});

        for(int i =0;i<count;i++){
            if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
        }

    }
}
