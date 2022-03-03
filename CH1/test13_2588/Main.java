package CH1.test13_2588;

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C , D , E ;
		C = (B%10)*A;
		D = (B%100-(B%10))/10*A;
		E = (B-(B%100-(B%10)))/100*A;
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(C+(D*10)+(E*100));
}}