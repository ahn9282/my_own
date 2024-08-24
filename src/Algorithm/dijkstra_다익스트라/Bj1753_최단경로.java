package Algorithm.dijkstra_다익스트라;

import java.io.*;
import java.util.*;

public class Bj1753_최단경로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int  M= Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        List<Node>[] listArr = new ArrayList[N + 1];
        boolean[] visited = new boolean[N + 1];
        int[] dist = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            listArr[i]= new ArrayList<Node>();
            dist[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            listArr[a].add(new Node(b, c));
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Node> que = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        dist[start] = 0;
        que.add(new Node(start, 0));
        while (!que.isEmpty()) {
            Node now = que.poll();
            if(!visited[now.end]) visited[now.end] = true;
            for (int i = 0; i < listArr[now.end].size(); i++) {
                Node next = listArr[now.end].get(i);

                if (!visited[next.end] && now.weight + next.weight < dist[next.end]) {
                    dist[next.end] = now.weight + next.weight;
                    que.add(new Node(next.end, dist[next.end]));
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            if(dist[i] == Integer.MAX_VALUE) sb.append("INF\n");
            else sb.append(dist[i] + "\n");
        }
        System.out.println(sb.toString());
    }
}

class Node  {

    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

}