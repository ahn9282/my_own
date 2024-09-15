package BaekJoon.silver;

import java.io.*;
import java.util.*;
public class Bj2667_단지번호붙이기 {
    static int[][] dxdy = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] arr;
    static boolean[][] visited;
    static int N, answer;
    static List<Integer> list;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         N = Integer.parseInt(br.readLine());
         arr = new int[N][N];
        visited = new boolean[N][N];
        sb = new StringBuilder();
        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        for (int y = 0; y < N; y++) {
            for(int x = 0 ; x < N; x++){
                answer = 0;
                dfs(y, x);
                if(answer != 0 ) {
                    list.add(answer);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
    static void dfs(int y , int x){
        if(arr[y][x] ==0 )return;
        visited[y][x] = true;
        answer++;
        arr[y][x] = 0;
        for (int[] xy : dxdy) {
            int dy = y + xy[0];
            int dx = x + xy[1];
            if (dy >= 0 && dy < N && dx >= 0 && dx < N) {
                if(!visited[dy][dx]){
                    dfs(dy, dx);
                }
            }
        }
    }
}
