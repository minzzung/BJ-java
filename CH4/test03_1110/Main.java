package CH4.test03_1110;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
        
		int count = 0;
		int copy = n;
        
		while (true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			count++;
 
			if (copy == n) {
				break;
			}
		}
		System.out.println(count);
	}
}
