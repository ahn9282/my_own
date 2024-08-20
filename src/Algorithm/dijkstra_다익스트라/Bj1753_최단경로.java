package Algorithm.dijkstra_다익스트라;

import java.io.*;
import java.util.*;

public class Bj1753_최단경로 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int  M= Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        bw.write(0);
        int[][] arr = new int[M][3];
        for (int i = 0; i < M; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(start);
        boolean[] visited = new boolean[N + 1];
        visited[start] = true;
        int[] dist = new int[N + 1];
        dist[start] = 0;
        while (!que.isEmpty()) {
            int now = que.poll();

        }
    }
}
class Node{
    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
}