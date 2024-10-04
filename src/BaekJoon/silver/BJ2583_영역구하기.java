package BaekJoon.silver;

import java.io.*;
import java.util.*;

public class BJ2583_영역구하기 {
    static StringTokenizer st;
    static int M, N, K, count;
    static int[][] arr;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[M][N];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken());
            int ry = Integer.parseInt(st.nextToken());

            count++;
            for (int y = ly; y < ry; y++) {
                for (int x = lx; x < rx; x++) {
                    arr[y][x] = 1;
                }
            }
        }
        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (arr[y][x] == 0) {
                    int areaSize = dfs(x, y);
                    list.add(areaSize);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int area : list) {
            System.out.print(area + " ");
        }
    }

    public static int dfs(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= M || arr[y][x] != 0) return 0;
        arr[y][x] = -1;
        int areaSize = 1;
        for (int i = 0; i < 4; i++) {
            int tx = dx[i] + x;
            int ty = dy[i] + y;
            areaSize += dfs(tx, ty);
        }
        return areaSize;
    }
}




