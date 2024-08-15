package Algorithm.DFS_BFS;
import java.io.*;
import java.util.*;

public class BJ2606_바이러스_DFS {
    public static ArrayList<Integer>[] graph;
    public static int[] visited;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        visited = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int infectedCount = dfs(1) - 1;
        System.out.println(infectedCount);
    }

    public static int dfs(int node) {
        visited[node] = 1;
        int count = 1;

        for (int neighbor : graph[node]) {
            if (visited[neighbor] == 0) {
                count += dfs(neighbor);
            }
        }

        return count;
    }
}
