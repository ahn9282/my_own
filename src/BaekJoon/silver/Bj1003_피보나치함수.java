package BaekJoon.silver;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Bj1003_피보나치함수 {
    static int N;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        dp = new int[41][2];
        dp[0][0] = 1;
        dp[1][1] = 1;
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            System.out.println(dp[num][0] + " " + dp[num][1]);
        }
    }

}
