package swea.d3.S_1206_Flatten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1208_Flatten_V2 {
    static int[] arr;

    public static void main(String[] args) throws IOException {

        int iter = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= iter; test_case++) {

            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
             arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            for (int i = 0; i < N; i++) {
                flatten();
            }
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }
            int answer = max - min;
            System.out.println("#" + test_case + " " + answer);
        }
    }

    static void flatten() {
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        arr[maxIndex]--;
        arr[minIndex]++;
    }


}
