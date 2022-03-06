package CH3.test04_15552;

import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            int a = Integer.parseInt(br.readLine());            
            for ( int i = 0; i<a;i++){
                st = new StringTokenizer(br.readLine());
                bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
            }
            bw.close();
            
        }catch (IOException e){

        }
        
    }
}
