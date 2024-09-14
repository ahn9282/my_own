package swea.d3;

import java.util.Scanner;

public class s_22039_피보나치수분배 {
    public static void main(String[] args) {
        int[] dp = new int[101];
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int now = sc.nextInt();
            int sum = 0;

            for (int j = 1; j <= now; j++) {
                sum += dp[j];
            }

            if (sum % 2 == 1) {
                System.out.println("impossible");
            } else {
                StringBuilder result = new StringBuilder(repeat('B', now));
                int halfSum = sum / 2;

                for (int j = now; j > 0; j--) {
                    if (halfSum >= dp[j]) {
                        result.setCharAt(j - 1, 'A');
                        halfSum -= dp[j];
                    }
                }

                System.out.println(result);
            }
        }

        sc.close();
    }

    static String repeat(char c, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}
