package Algorithm.numberthory_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestDivide2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Integer.parseInt(st.nextToken());
        long num2 = Integer.parseInt(st.nextToken());
        br.close();
        long sum = 0;
        for (long i = num1; i <= num2; i++) {
            sum += bibi(i);
        }
        System.out.println(sum);

    }

    private static long bibi(long num) {
        long val = 1;
        for (int i = 2; i <= num; i *= 2) {
            if (num % i == 0) {
                val = i;
            }
        }

        return val;
    }


}

