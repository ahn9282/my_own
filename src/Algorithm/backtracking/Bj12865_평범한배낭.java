package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj12865_평범한배낭 {

    public static int eff;
    public static int[][] arr;
    public static int N;
    public static int K;
    public static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         K = Integer.parseInt(st.nextToken());
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        recur(0, 0, 0);
        System.out.println(max);
    }

    public static void recur(int index, int W, int V){
            if(W > K) return;
        if (index == N) {
            max = Math.max(max, V);
            return;
        }
        if(W + arr[index][0] <= K) {
            recur(index + 1, W + arr[index][0], V + arr[index][1]);
        }
        recur(index + 1, W, V);
    }
}
