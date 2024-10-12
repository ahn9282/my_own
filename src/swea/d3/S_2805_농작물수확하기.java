package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2805_농작물수확하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= test_case; i++) {

            int limit = 0;
            int answer = 0;
            int N = Integer.parseInt(br.readLine());
            if (N > 1) {
                limit = (N - 1) / 2;
            }
            int range = 0;

            for (int y = 0; y < N; y++) {

                char[] charArray = br.readLine().toCharArray();


                int leftLimit = limit - range;
                int rightLimit = limit + range;

                for (int x = 0; x < N; x++) {

                    if (x >= leftLimit && x <= rightLimit) {
                        int value = charArray[x] - '0';
                        answer += value;

                    }
                }

                if (y < limit) {
                    range++;
                    continue;
                }
                range--;

            }

            System.out.println("#" + test_case + " " + answer);

        }
    }


}
