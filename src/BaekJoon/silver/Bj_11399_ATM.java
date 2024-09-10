package BaekJoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int before = arr[0];
        int answer = arr[0];
        for(int i = 1 ; i < N ; i++){
            before += arr[i];
            answer += before;
        }
        System.out.println(answer);
    }
}
