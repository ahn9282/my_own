package Algorithm.backtracking.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2503_수자야구 {
    static int  count = 0;;
    static   int[] arr = {};
    static  int[] ball = {};
    static int[] strike = {};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        arr = new int[n];
        ball = new int[n];
        strike = new int[n];
        for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            ball[i] = Integer.parseInt(st.nextToken());
            strike[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 102; i < 1000; i++) {
            recur(0,i,n);
        }
            System.out.println(count);

    }

    public static void recur(int idx, int num, int maxIndex) {
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        for ( idx = 0; idx < arr.length; idx++) {
            int target = arr[idx];
            int x = target / 100;
            int y = (target / 10) % 10;
            int z = target % 10;
            int currentBallCount = 0;
            int currentStrikeCount = 0;
            if (a == x) currentStrikeCount++;
            else if (a == y || a == z) currentBallCount++;
            if (b == y) currentStrikeCount++;
            else if (b == x || b == z) currentBallCount++;
            if (c == z) currentStrikeCount++;
            else if (c == x || c == y) currentBallCount++;
            if (currentBallCount < ball[idx] || currentStrikeCount < strike[idx]) {
                return;
            }
        }
            if (idx == maxIndex) {
                count++;
            }
    }

}
