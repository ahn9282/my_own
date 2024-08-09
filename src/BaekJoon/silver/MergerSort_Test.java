package BaekJoon.silver;

import java.io.*;

public class MergerSort_Test {

    public static int[] arr, tmp;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        tmp = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

    }
    public static void merge_sort(int s, int e){
        int m = s + (e - s) / 2;
        merge_sort(s, m);
        merge_sort(m + 1, e);
        for (int i = s; i <= e; i++) {
            tmp[i] = arr[i];
        }
    }
}
