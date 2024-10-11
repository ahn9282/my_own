package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1249_보급로 {

    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= N; test_case++) {

            int M = Integer.parseInt(br.readLine());
            arr = new int[M][M];
            visited = new boolean[M][M];
            answer = Integer.MAX_VALUE;

            for (int y = 0; y < M; y++) {

                String str = br.readLine();
                for (int x = 0; x < M; x++) {
                    arr[y][x] = str.charAt(x) - '0';
                }

            }

            dfs(0, 0, 0);
            System.out.println("#" + test_case + " " + answer);
        }
    }

    static void dfs(int row, int col, int count) {

        if (row < 0 || col < 0 || row >= arr.length || col >= arr.length  ) return;

        if (count >= answer) return;

        if (row == arr.length - 1 && col == arr.length - 1) {
            answer = count;
            return;
        }

        visited[row][col] = true;

        for (int i = 0; i < 4; i++) {
            int x = col + dx[i];
            int y = row + dy[i];

            if (y >= 0 && y < arr.length && x >= 0 && x < arr.length && !visited[y][x]) {
                dfs(y, x, count + arr[y][x]);
            }
        }

        visited[row][col] = false;
    }
}
