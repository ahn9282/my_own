package Algorithm.tree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj11725_트리부모찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer>[] arr = new HashSet[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new HashSet<Integer>(2);
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        boolean[] visited = new boolean[N + 1];
        int[] answer = new int[N + 1];
        int start = 1;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        while (!que.isEmpty()) {
            int now = que.poll();
            if (!visited[now]) visited[now] = true;
            for (int i : arr[now]) {
                if (!visited[i]) {
                    que.add(i);
                    answer[i] = now;
                }

            }
        }
        for (int i = 2; i < answer.length; i++) {
            sb.append(answer[i]);
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
}
