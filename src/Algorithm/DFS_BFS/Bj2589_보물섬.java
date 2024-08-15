package Algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Bj2589_보물섬 {
    public static List<char[]> graph;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>(Y);
        for (int i = 0; i < Y; i++) {
            char[] charArray = br.readLine().toCharArray();
            graph.add(charArray);
        }
        int[][] wasd = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int max = 0;
        for (int y = 0; y < Y; y++) {
            for (int x = 0; x < X; x++) {
                if (graph.get(y)[x] == 'L') {
                    boolean[][] visited = new boolean[Y][X];
                    int[][] dist = new int[Y][X];
                    Deque<int[]> que = new LinkedList<>();
                    que.add(new int[]{y, x});
                    while (que.size() > 0) {
                        int[] xy = que.pop();
                        int ey = xy[0];
                        int ex = xy[1];
                        for (int i = 0; i < 4; i++) {
                            int ny = ey + wasd[i][0];
                            int nx = ex + wasd[i][1];
                            if ((ny >= 0 && ny < Y) && (nx >= 0 && nx < X)) {
                                if (graph.get(ny)[nx] == 'L') {
                                    if (!visited[ny][nx]) {
                                        System.out.println("ny : " + ny + ", nx : " + nx);
                                        visited[ny][nx] = true;
                                        dist[ny][nx] = dist[ey][ex]++;
                                        max = Math.max(max, dist[ny][nx]);
                                        que.add(new int[]{ny, nx});
                                    }
                                }
                            }
                        }
                    }
                    System.out.print("distance : [");
                    for (int[] arr : dist) {
                        System.out.print("[");
                        for (int i : arr) {
                            System.out.print(i + " ");
                        }
                        System.out.print("], ");
                    }
                    System.out.println("]");
                }
            }
        }
        System.out.println(max);

    }
}
