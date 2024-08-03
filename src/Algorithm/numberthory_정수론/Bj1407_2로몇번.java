package Algorithm.numberthory_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1407_2로몇번 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());
        br.close();
        System.out.println(bibi(8));
        System.out.println(bibi(num1 - 1));
        System.out.println(bibi(num2));
        long result = result = bibi(num2) - bibi(num1 - 1);
        System.out.println(result);
    }
    private static long bibi(long num) {
        long val = num;
        for (long i = 2; i <= num; i *= 2) {
            val += num / i * (i /2);
        }

        return val;
    }
}

