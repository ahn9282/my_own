package Algorithm.practice_BFS_DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj2178_미로탐색하기 {
    static int N;
    static int M;
    static int[] dx = new int[]{0,0,1,-1};
    static int[] dy = new int[]{1, -1, 0, 0};
    static int[][] arr;
    static boolean[][] visited;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for (int y = 0; y < N; y++) {
            String[] stArr = br.readLine().split("");
            for (int x = 0; x < M; x++) {
                arr[y][x] = Integer.parseInt(stArr[x]);
            }
        }
        visited = new boolean[N][M];
        int[] xy = new int[]{0, 0};
        BFS(xy);
        System.out.println(arr[N - 1][M -1]);
    }

    public static void BFS(int[] xy ) {
        if(visited[xy[0]][xy[1]]) return;
        if (xy[0] == N - 1 && xy[1] == M - 1) {
            answer = arr[xy[0]][xy[1]];
            return;
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(xy);
        visited[xy[0]][xy[1]] = true;

        while(!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int ex = now[1] + dx[i];
                int ey = now[0] + dy[i];

                if (ex < 0 || ex >= M || ey < 0 || ey >= N) continue;
                if (arr[ey][ex] != 0 && !visited[ey][ex]) {
                    visited[ey][ex] = true;
                    arr[ey][ex] = arr[now[0]][now[1]]+1;
                    q.add(new int[]{ey, ex});

                }
            }
        }

    }
}