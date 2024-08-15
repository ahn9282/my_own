package Algorithm.practice_BFS_DFS;

import java.io.*;
import java.util.*;

public class Bj1260_BFS와DFS프로그램 {
    public static int N;
    public static int M;
    public static int start;
    static ArrayList<Integer>[] arr;
    static boolean[] already;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);

        }
        for (int i = 0; i <= N; i++) {
            Collections.sort(arr[i]);
        }

            already = new boolean[N + 1];
        DFS(start);
        System.out.println();
        Arrays.fill(already, false);
        BFS(start);
        System.out.println();
    }

    public static void BFS(int start) {

        Queue<Integer> q = new LinkedList<>();
        already[start] = true;
        q.add(start);
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            for (int i : arr[now]) {
                if (!already[i]) {
                    q.add(i);
                    already[i] = true;
                }
            }
        }

        already[start] = false;
    }

    public static void DFS(int start) {
        already[start] = true;
        System.out.print(start + " ");
        for (Integer i : arr[start]) {
            if (!already[i]) {
                DFS(i);
            }
        }
    }
}