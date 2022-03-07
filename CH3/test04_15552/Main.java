package CH3.test04_15552;

import java.io.*;

import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("입력");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(br.readLine());            
            for ( int i = 0; i<a;i++){
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                
            }
            
        }catch (IOException e){

        }
        
    }
}
