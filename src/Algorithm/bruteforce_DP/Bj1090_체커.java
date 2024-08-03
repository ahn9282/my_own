package Algorithm.bruteforce_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1090_체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        Arrays.fill(answer, Integer.MAX_VALUE);
        List<int[]> inputs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            inputs.add(new int[]{x, y});
            X[i] = x;
            Y[i] = y;

        }
        for (int x = 0; x < X.length; x++) {
            for (int y = 0; y < Y.length; y++) {
                int toX = X[x];
                int toY = Y[y];
                List<Integer> distances = new ArrayList<>();
                for (int[] input : inputs) {

                    int nowX = input[0];
                    int nowY = input[1];

                    int farX = Math.abs(toX - nowX);
                    int farY = Math.abs(toY - nowY);
                    distances.add(farX + farY);
                }
                distances.sort(Comparator.naturalOrder());
                int sum = 0;
                for (int i = 0; i < distances.size(); i++) {
                    sum += distances.get(i);
                    answer[i] = Math.min(answer[i], sum);
                }

            }

        }
        for (int i = 0; i < N; i++) {
            System.out.print(answer[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
    }

}
