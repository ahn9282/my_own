package Algorithm.tompdown_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj12865_평범한배낭 {

    public static int[][] arr;
    public static int N;
    public static int K;
    public static int max = 0;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         K = Integer.parseInt(st.nextToken());
        arr = new int[N][3];
        System.out.println("arr : [");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = arr[i][1] - arr[i][0];
            System.out.print(" [ "+arr[i][0]+ ", " + arr[i][1]+ ", " + arr[i][2]+" ] ");
            if(i == N-1) System.out.println();
        }
        System.out.println("]");

        recur(0, 0, 0);
        System.out.println(max);
    }

    public static void recur(int index, int w, int v) {
        if (w > K)return ;
        if (index == N) {
            if (w <= K) {
                max = Math.max(max, v);
            }
            return;
        }

        recur(index + 1, w + arr[index][0], v + arr[index][1]);
        recur(index + 1, w , v );

    }
}
