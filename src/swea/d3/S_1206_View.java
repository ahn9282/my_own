package swea.d3;

import java.io.*;
import java.util.*;

public class S_1206_View {
    static int left, right, count, answer;
    static int[] arr;
    static int[] sides = {-2, -1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int iter = 10;

        for (int i = 1; i <= iter; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            count = i;
            left = 0;
            right = 0;
            answer = 0;
             arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int idx = 2; idx < N- 2; idx++) {
                answer += getView(idx);
            }
            sb.append("#").append(count).append(" ");
            sb.append(answer).append("\n");

        }
        br.close();
        System.out.println(sb.toString());
    }

    static int getView(int idx) {
        int maxSide = 0;
        int index;
        for (int i = 0; i < 4; i++) {
            index = idx + sides[i];
            maxSide = Math.max(arr[index], maxSide);
        }
        int result = arr[idx] - maxSide;
        return Math.max(result, 0);
    }
}
