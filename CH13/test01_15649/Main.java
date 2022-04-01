package CH13.test01_15649;

import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int [M]; //길이가 M개인 수열
        visit = new boolean[N];
        dfs(N,M,0); //깊이 우선 탐색
        

    }
    public static void dfs(int N,int M,int depth){
        if(depth == M){
            for(int i = 0;i<M;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
            
        }
        for(int i =0;i<N;i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth] = i+1;
                dfs(N,M,depth+1);
                visit[i]=false;
            }
        }
    }
}
