package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj2525_오븐시계 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        int min = H * 60 + M;
        min += time;
        M = min % 60;
        H = min / 60 % 24;


        System.out.println(H+" " + M);

    }
}
