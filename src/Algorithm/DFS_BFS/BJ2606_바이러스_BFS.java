package Algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ2606_바이러스_BFS {
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
         visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        int seed = 0;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
            if(i == 0)seed = a;
        }

        Deque<Integer> que = new LinkedList<>();
        que.add(1);

        while (que.size() > 0) {
            int node = que.pop();
            visited[node] = true;
            for (int i = 0; i < graph[node].size(); i++) {
                int now = graph[node].get(i);
                if (visited[now]) {
                    continue;
                }
                    que.add(now);
                visited[now] = true;
            }
        }
        int answer = 0;
        for (int i =0 ; i < N+1;i++) {
            if(visited[i]) answer++;
        }
        System.out.println(answer - 1);
    }


}
