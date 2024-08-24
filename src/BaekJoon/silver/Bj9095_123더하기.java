package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj9095_123더하기 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new int[11];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            recur(now);
            System.out.println(dp[now]);
        }
    }

    public static void recur(int target) {
        if(target >=4) {
            if (dp[target - 3] == -1) recur(target - 3);
            if (dp[target - 2] == -1) recur(target - 2);
            if (dp[target - 1] == -1) recur(target - 1);
            dp[target] = dp[target - 1] + dp[target - 2] + dp[target - 3];
        }else{
            return;
        }
    }
}
