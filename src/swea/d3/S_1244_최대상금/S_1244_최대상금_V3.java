package swea.d3.S_1244_최대상금;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S_1244_최대상금_V3 {
    static int N;
    static int max ;
    static int[] arr;


    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T =Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int count = 1; count <= T; count++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            N = Integer.parseInt(st.nextToken());
            arr = new int[str.length()];
             max = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = str.charAt(i) - '0';
            }

            if (arr.length < N) {
                N = arr.length;
            }

            DFS(0, 0);

            System.out.println("#" + count + " " + max);
            max = 0;
        }
    }

    static void DFS(int start, int depth) {
        if (depth == N) {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result = result * 10 + arr[i];
            }

            max = Math.max(result, max);

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(i, j);
                DFS(i, depth + 1);
                swap(i, j);
            }
        }
    }

    static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}