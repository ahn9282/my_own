package Algorithm.binarysearch_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2805_나무자르기 {
    public static int[] arr;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int e = 0;
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
                   int num= Integer.parseInt(st.nextToken());
            arr[i] = num;
            e = Math.max(e, num);
        }
        int s = 1;
        int a = 0;
        while (s <= e) {
            int mid = (s + e) / 2;
            int answer = 0;
            for (int i = 0; i < arr.length; i++) {
                int tree = arr[i];
                if (tree > mid) {
                    answer += tree - mid;
                }
            }
            if (answer >= M) {
                a = mid;
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        System.out.println(a);
    }
}



