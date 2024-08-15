package Algorithm.practice_BFS_DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj13023_ABCDE {
    public static boolean[] already;
    public static int count = 0;
    static ArrayList<Integer>[] arr;
    static int M;
    static int N;
    static boolean exist = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
             st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
         already = new boolean[N];
        for (int i = 0; i < N; i++) {
            recur(i, 1);
        }
        if (exist) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void recur(int number, int depth) {
        if(depth == 5){
            exist = true;
            return;
        }
        already[number] = true;
        for (Integer integers : arr[number]) {
            if (!already[integers])
            recur(integers, depth + 1);
        }
            already[number] = false;
        count = Math.max(count, depth);
    }
}