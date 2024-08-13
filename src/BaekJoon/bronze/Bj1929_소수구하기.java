package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = a; i <= b; i++) {
            if (qasd(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean qasd(int num) {
        if(num == 2 || num == 3)return true;
        if(num == 1)return false;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 2) {
            if(num % i ==0)return false;
        }
        return true;
    }
}
