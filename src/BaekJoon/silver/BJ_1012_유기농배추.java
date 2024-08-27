package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1012_유기농배추 {
    static int[][] xy = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] arr ;
    static int answer= 0;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int bc = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            answer = 0;

            for (int j = 0; j < bc; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }
            for (int q = 0; q < N; q++) {
                for (int w = 0 ; w < M; w++) {
                    if (arr[q][w] == 1) {
                        isClose(q, w);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void isClose(int y, int x) {
            arr[y][x] = 0;
            for (int i = 0; i < xy.length; i++) {
                int dx = xy[i][1] + x;
                int dy = xy[i][0] + y;
                if (dx >= 0 && dx < M && dy >= 0 && dy < N && arr[dy][dx] == 1) {
                    isClose(dy, dx);
                }
            }
    }
}

