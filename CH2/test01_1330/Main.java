package CH2.test01_1330;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        if (A>B){
            System.out.println(">");
        }
        else if(A<B){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }

        
    }
}