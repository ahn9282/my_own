package Algorithm.backtracking.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj15649_N과M_1 {
    public static int N; // 자연수 N
    public static int M; // 자연수 M

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.valueOf(st.nextToken());
         M = Integer.valueOf(st.nextToken());
        br.close();
        arr = new int[M];
        visit = new boolean[N];

        recur(0);
        System.out.println(sb);
    }

    public static void recur(int depth){
        if (depth == M){
            for(int val : arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {

            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                recur(depth + 1);


                visit[i] = false;
            }
        }

    }

    }


