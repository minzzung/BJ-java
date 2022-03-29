package CH11.test05_1427;

 
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int[] count = new int[10];
 
		int N = in.nextInt();
 
		while (N != 0) {
			count[N % 10]++;
			N /= 10;
		}
 
		for (int i = 9; i >= 0; i--) {
			while (count[i]-- > 0) {
				System.out.print(i);
			}
		}
 
	}
}

