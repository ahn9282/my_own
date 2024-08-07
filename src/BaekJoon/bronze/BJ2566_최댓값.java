package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2566_최댓값 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int x = 0;
        int y = 1;
        int X = 0;
        int Y = 0;

        StringTokenizer st = null;
        String[] s = br.readLine().split(" ");
        int n = s.length;
        for (int i = 0; i < n; i++) {
            x++;
            int a = Integer.parseInt(s[i]);
            if (a >= max) {
                max = a;
                X = x;
                Y = y;
            }

        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x = 0;
            y++;
            for (int j = 0; j < n; j++) {
                x++;
                int a = Integer.parseInt(st.nextToken());
                if (a > max) {
                    max = a;
                    X = x;
                    Y = y;
                }
            }
        }
        System.out.println(max);
        System.out.println(Y + " " + X);
    }
}
