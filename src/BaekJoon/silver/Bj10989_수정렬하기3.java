package BaekJoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10989_수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Radix_Sort(arr, 5);
        for (int i =0 ; i < arr.length ; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static void Radix_Sort(int[] arr, int max_size) {
        int[] output = new int[arr.length];
        int now = 1;
        int num = 0;
        while (num != max_size) {
            int[] bucket = new int[10];
            for (int i = 0; i < arr.length; i++) {
                bucket[(arr[i] / now) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                output[bucket[(arr[i] / now % 10)] - 1] = arr[i];
                bucket[(arr[i] / now) % 10]--;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = output[i];
            }
            now *= 10;
            num++;
        }
    }
}
