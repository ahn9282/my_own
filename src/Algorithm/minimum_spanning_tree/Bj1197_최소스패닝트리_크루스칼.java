package Algorithm.minimum_spanning_tree;

import java.io.*;
import java.util.*;

public class Bj1197_최소스패닝트리_크루스칼 {
    static int parent[];
    static List<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        PriorityQueue<cruscalNode> que = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            que.add(new cruscalNode(a, b, c));
        }
        int answer = 0;
        for (int i = 0 ; i < que.size(); i++) {
            cruscalNode node = que.poll();
            int A = find(node.start);
            int B = find(node.end);

            if(A != B){
                union(A, B);
                answer += node.weight;
            }
        }
        System.out.println(answer);


    }
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
        }
    }
}
 class cruscalNode{
    int start;
    int end;
    int weight;

    public cruscalNode(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
