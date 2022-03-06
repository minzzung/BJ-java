package CH3.test04_15552;

import java.io.*;
<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> 091548acd5763d3c9a21b51307842965f4f0bfe5
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            int a = Integer.parseInt(br.readLine());            
            for ( int i = 0; i<a;i++){
                st = new StringTokenizer(br.readLine());
                bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
            }
            bw.close();
=======
            System.out.println("입력");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(br.readLine());            
            for ( int i = 0; i<a;i++){
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                
            }
>>>>>>> 091548acd5763d3c9a21b51307842965f4f0bfe5
            
        }catch (IOException e){

        }
        
    }
}
