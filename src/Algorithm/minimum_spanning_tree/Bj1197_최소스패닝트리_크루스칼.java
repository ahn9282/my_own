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
        Arrays.fill(parent, Integer.MAX_VALUE);
        arr = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i].add(a);
            arr[i].add(b);
            parent[b] = a;
            arr[i].add(Integer.parseInt(st.nextToken()));
        }
        int answer = 0;
        for(int i = 0 ; i < arr.length; i++){
            int A = arr[i].get(0);
            int B = arr[i].get(1);
            int weight = arr[i].get(2);

            A = find(A);
            B = find(B);
            if(A == B){
                continue;
            }else{
                union(A, B);
                answer += weight;
            }
        }
        System.out.println(answer);


    }
public static int find(int x) {
  while(parent[x] !=x){
      x = parent[x];
  }
  return x;
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
