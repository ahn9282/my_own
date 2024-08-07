package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2798_블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int answer = 0;
        boolean[] check = new boolean[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
        }
        for (int a = 0; a < N; a++) {
            check[a] = true;
            for (int b = 0; b < N; b++) {
                if (!check[b]) {
                    check[b] = true;
                    for (int c = 0; c < N; c++) {
                        if (!check[c]) {
                            int sum = arr[a] + arr[b] + arr[c];
                            if (sum <= M) {
                                answer = Math.max(answer, sum);
                            }
                        }
                        }
                    check[b] = false;
                }
            }
            check[a] = false;
        }
            System.out.println(answer);
    }
}
