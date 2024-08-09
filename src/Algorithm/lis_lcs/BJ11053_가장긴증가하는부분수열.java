package Algorithm.lis_lcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11053_가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 0;
        int[] dp = new int[T];
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int a = 0; a < T; a++) {

            for (int b = 0; b < a; b++) {
                if (arr[a] > arr[b]) {
                    dp[a] = Math.max(dp[a], dp[b] + 1);
                }
            }
            count = Math.max(dp[a], count);
        }
        System.out.println(count);
    }
}
