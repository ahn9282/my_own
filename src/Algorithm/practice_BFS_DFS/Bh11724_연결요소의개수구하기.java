package Algorithm.practice_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bh11724_연결요소의개수구하기 {
    public static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
         visited = new boolean[N + 1];
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
        }

    public static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (Integer i : A[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
