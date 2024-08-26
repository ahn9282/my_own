package Algorithm.union_find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1717_집합의표현 {
    static int N, M;
    static int parent[];

public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];

        for (int i = 0; i < N + 1; i++) parent[i] = i; // 자기 자신으로 부모 초기화

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int sel = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (sel == 0) {
                union(a, b);
            } else {
                if (find(a) == find(b)) System.out.println("YES");
                else System.out.println("NO");
            }
        }

    }
    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    //납득 안됫던 부분
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        //각 노드의 루트를 구한 다음 크기가 큰 값을 작은 값의 자식으로 넣어
        //트리 정리 및 최적화
        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
        }
    }

}