package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2839_설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 1000000;
        int v = 1000000;
            if(N % 3==0){
                v = N / 3;
                answer = Math.min(answer, v);
            }
        for (int i = 1; i <= N / 5; i++) {
        int tmp = 0;
            tmp = N - 5 * i;
            if (tmp % 3 == 0) {
                v = i + tmp / 3;
            }
            answer = Math.min(answer, v);
        }
        if(answer ==1000000 )answer = -1;
        System.out.println(answer);
    }
}
