package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ14502_적록색약 {
    static int[][] xy = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static char[][] arr;
    static int N;
    static String S;
    static boolean[][] visits;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         N = Integer.parseInt(br.readLine());
        arr = new char[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int count = 0;
        visits = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visits[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        int normal = count;

        count = 0;
        visits = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visits[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        int abnormal = count;
        System.out.println(normal + " " + abnormal);

    }


    public static void dfs(int x, int y) {
        visits[x][y] = true;
        char tmp_char = arr[x][y]; // R
        for (int i = 0; i < 4; i++) {
            int dx = x + xy[i][1];
            int dy = y + xy[i][0];

            if (dx < 0 || dy < 0 || dx >= N || dy >= N) {
                continue;
            }

            if (!visits[dx][dy] && arr[dx][dy] == tmp_char) {
                dfs(dx, dy);
            }
        }
    }
}
