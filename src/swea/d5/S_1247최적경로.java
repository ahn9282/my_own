package swea.d5;

import java.io.*;
import java.util.StringTokenizer;

public class S_1247최적경로 {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int N, answer, startX, startY, homeX, homeY;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int t = 1; t <= N; t++) {
            int T = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            homeX = Integer.parseInt(st.nextToken());
            homeY = Integer.parseInt(st.nextToken());

            System.out.println("startX = " + startX);
            System.out.println("startY = " + startY);
            System.out.println("homeX = " + homeX);
            System.out.println("homeY = " + homeY);
            arr = new int[T][2];
            visited = new boolean[T];
            for (int i = 0; i < T; i++) {
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            answer = Integer.MAX_VALUE;
            dfs(0, startX, startY, 0);
            bw.write("#" + t + " " + answer + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static void dfs(int count, int x, int y, int dist) {
        if (count == arr.length) {
            dist += Math.abs(x - homeX) + Math.abs(y - homeY);
            answer = Math.min(answer, dist);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int newDistance = dist + Math.abs(x - arr[i][0]) + Math.abs(y - arr[i][1]);
                dfs(count + 1, arr[i][0], arr[i][1], newDistance);
                visited[i] = false;
            }
        }
    }
}
