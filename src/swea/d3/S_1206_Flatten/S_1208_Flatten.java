package swea.d3.S_1206_Flatten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1208_Flatten {
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
            int answer =  arr[arr.length - 1] - arr[0];
            System.out.println("#" + test_case + " " + answer);
        }
    }

    static void flatten() {
        int last = arr.length - 1;
        arr[0] += 1;
        arr[last] -= 1;
        preSwap(0, 1);
        postSwap(last, last - 1);

    }

    static void preSwap(int pre, int post) {
        if (arr[pre] > arr[post]) {
            int temp = arr[pre];
            arr[pre] = arr[post];
            arr[post] = temp;
            preSwap(pre + 1, post + 1);
        }

    }

    static void postSwap(int last, int pre) {
        if (arr[last] < arr[pre]) {
            int temp = arr[last];
            arr[last] = arr[pre];
            arr[pre] = temp;
            postSwap(last - 1, pre - 1);
        }

    }
}
