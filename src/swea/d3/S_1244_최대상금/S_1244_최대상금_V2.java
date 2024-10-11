package swea.d3.S_1244_최대상금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1244_최대상금_V2 {
    static char[] arr;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String maxNumLen = st.nextToken();
            int maxChange = Integer.parseInt(st.nextToken());

             answer = 0;
            arr = maxNumLen.toCharArray();

            findMaxValue( 0, maxChange);

            sb.append("#").append(i).append(" ").append(answer).append("\n");
        }

        br.close();
        System.out.println(sb.toString());
    }

    static void findMaxValue(int iterate, int limit) {

        int currentValue = Integer.parseInt(new String(arr));
        answer = Math.max(answer, currentValue);


        if (iterate == limit) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(i, j);
                findMaxValue(iterate + 1, limit);
                swap(i, j);
            }
        }
    }
    static void swap(int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
