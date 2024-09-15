package BaekJoon.silver;

import java.io.*;
import java.util.*;

public class BJ7576_토마토_dfs_실패 {
    static int[][] arr;
    static int[][] xy = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static boolean[][] already;
    static int X,Y, day;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        boolean able = true;
        already = new boolean[Y][X];
        arr = new int[Y][X];
        for (int i = 0; i < Y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < X; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        day = 0;
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if(arr[i][j] == 1) dfs(i, j, 0);
            }
        }
        for (boolean[] booleans : already) {
            for (boolean tf : booleans) {
                if(!tf) able = false;
            }
        }
        if(!able) System.out.println(-1);
        else System.out.println(day);
    }

    static void dfs(int y, int x, int date) {
        if (arr[y][x] == 0) arr[y][x] = 1;
        day = Math.max(day, date);
        already[y][x] = true;
        for (int[] dd : xy) {
            int dy = dd[0] + y;
            int dx = dd[1] + x;
            if (dy >= 0 && dy < Y && dx >= 0 && dx < X) {
                if (!already[dy][dx] && arr[dy][dx] != -1) {
                    dfs(dy, dx, date + 1);
                }
            }
        }
    }
}

