package Algorithm.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1991_트리순회 {
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         arr = new int[130][2];
        int start = 0;
        int last = 0;
        for(int i = 0; i < N ; i++) {
            String str = br.readLine();
            int a =(int) str.charAt(0);
            int b = (int)str.charAt(2);
            int c = (int)str.charAt(4);
            arr[a][0] = b;
            arr[a][1] = c;
            if(i ==0) start = a;
            if(i == N -1) last = a;
        }
            recur1(start);
        sb.append("\n");
        recur2(start);
        sb.append("\n");
        recur3(start);
        sb.append("\n");
        System.out.println(sb.toString());

    }
    public static void recur1(int node){

        if(node == 46) return;
        sb.append((char) node);
        recur1(arr[node][0]);
        recur1(arr[node][1]);
    }
    public static void recur2(int node){

        if(node == 46) return;
        recur2(arr[node][0]);
        sb.append((char) node);
        recur2(arr[node][1]);
    }
    public static void recur3(int node){

        if(node == 46) return;
        recur3(arr[node][0]);
        recur3(arr[node][1]);
        sb.append((char) node);
    }
}
