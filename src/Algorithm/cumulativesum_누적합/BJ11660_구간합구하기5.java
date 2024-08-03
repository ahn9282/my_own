package Algorithm.cumulativesum_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11660_구간합구하기5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int count = Integer.valueOf(st.nextToken());
        int[][] arr = new int[N][N];
        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] prefix = new int[N + 1][N + 1];
        for (int i = 1; i < prefix.length; i++) {
            for (int j = 1; j < prefix[0].length; j++) {
                prefix[i][j] = prefix[i][j - 1] + prefix[i - 1][j] - prefix[i - 1][j - 1] + arr[i - 1][j - 1];

            }
        }
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(prefix[x2][y2] + prefix[x1-1][y1-1] -(prefix[x2][y1-1] + prefix[x1 - 1][y2]));
            }


    }
}
