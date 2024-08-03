package Algorithm.cumulativesum_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14719_빗물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[x ];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;

        for (int i = 1; i < x - 1; i++) {
            int l = 0;
            int r = 0;
            for (int j = 0; j < i; j++) {
                l = Math.max(l, arr[j]);
            }
            for (int j = i+1; j < x; j++) {
                r = Math.max(r, arr[j]);

            }
            if(arr[i] < l && arr[i] <r) result += Math.min(l, r) - arr[i];
        }
        System.out.println(result);
    }

}
