package Algorithm.practice_BFS_DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj2023_신기한소수찾기 {
       static  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         N = Integer.parseInt(br.readLine());
        br.close();
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
        bw.flush();
        bw.close();
    }

    public static void DFS(int number, int count) throws IOException {
        if(count == N){
            if(prime(number)) bw.write(number + "\n");
            return;
        }
        for (int i = 1; i < 10; i+=2) {
            if(prime(number*10+i)) DFS(number * 10 + i, count + 1);
        }


    }

    public static boolean prime(int num) {

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}