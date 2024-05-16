package BaekJoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Bj1253 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            arr[i] = Long.parseLong(st.nextToken());

        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            long find = arr[i];
            int start = 0;
            int end = n - 1;

            while (start < end) {
                if (arr[start] + arr[end] == find) {

                    if (start != i && end != i) {
                        result++;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }

                } else if (arr[start] + arr[end] > find) {
                    end--;
                } else {
                    start++;
                }
            }

        }
        System.out.println(result);
        br.close();
    }
}
