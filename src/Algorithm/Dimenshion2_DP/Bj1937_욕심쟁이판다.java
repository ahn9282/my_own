package Algorithm.Dimenshion2_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1937_욕심쟁이판다 {

    public static int N;
    public static int[][] arr;
    public static int answer = 0;
    public static int[][] xy = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                answer =Math.max(answer,recur(x, y));
            }
        }
        System.out.println(answer);
    }
    public static int recur(int x, int y) {
        if(dp[y][x] != -1) return dp[y][x];
        int count = 1;
        for (int[] xys : xy) {
            int toX = x + xys[1];
            int toY = y + xys[0];
            if (toX >= 0 && toY >= 0 && toX < N && toY < N) {
                if (arr[y][x] < arr[toY][toX]) {
                    count = Math.max(count, recur(toX, toY) + 1);
                }
            }
        }
        dp[y][x] = count;
        return count;
    }

}
