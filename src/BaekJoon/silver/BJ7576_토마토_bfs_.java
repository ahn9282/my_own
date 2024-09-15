package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ7576_토마토_bfs_ {
    static int[][] arr;
    static int[][] xy = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int X,Y, day;
    static Queue<int[]> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        arr = new int[Y][X];
        for (int i = 0; i < Y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < X; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    que.offer(new int[]{i, j});
                }
            }
        }
        bfs();
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if(arr[i][j] == 0){
                    System.out.println(-1);
                    return;
                }else{
                    day = Math.max(day, arr[i][j]);
                }
            }
        }
        System.out.println(day - 1);
    }
    static void bfs(){
        while (!que.isEmpty()) {
            int[] now = que.poll();
            int y = now[0];
            int x = now[1];
            for (int[] dd : xy) {
                int dy = y + dd[0];
                int dx = x + dd[1];

                if(dy >= 0 && dy < Y && dx >= 0 && dx < X && arr[dy][dx] == 0){
                    arr[dy][dx] = arr[y][x] + 1;
                    que.offer(new int[]{dy, dx});
                }
            }
        }
    }
}

