package swea.d4;

import java.io.*;
import java.util.StringTokenizer;

public class S_21426흰종이와검은종이_2_수정 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testcase = 0; testcase < T; testcase++) {
            st = new StringTokenizer(br.readLine());
            int whiteX1 = Integer.parseInt(st.nextToken());
            int whiteY1 = Integer.parseInt(st.nextToken());
            int whiteX2 = Integer.parseInt(st.nextToken());
            int whiteY2 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int blackX1 = Integer.parseInt(st.nextToken());
            int blackY1 = Integer.parseInt(st.nextToken());
            int blackX2 = Integer.parseInt(st.nextToken());
            int blackY2 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int blackX3 = Integer.parseInt(st.nextToken());
            int blackY3 = Integer.parseInt(st.nextToken());
            int blackX4 = Integer.parseInt(st.nextToken());
            int blackY4 = Integer.parseInt(st.nextToken());

            boolean isCoveredByFirstBlack = isCovered(blackX1, blackY1, blackX2, blackY2, whiteX1, whiteY1, whiteX2, whiteY2);
            boolean isCoveredBySecondBlack = isCovered(blackX3, blackY3, blackX4, blackY4, whiteX1, whiteY1, whiteX2, whiteY2);

            int combinedMinX = Math.min(blackX1, blackX3);
            int combinedMaxX = Math.max(blackX2, blackX4);
            int combinedMinY = Math.min(blackY1, blackY3);
            int combinedMaxY = Math.max(blackY2, blackY4);

            boolean isCoveredByCombinedBlack = isCovered(combinedMinX, combinedMinY, combinedMaxX, combinedMaxY, whiteX1, whiteY1, whiteX2, whiteY2);

            if (isCoveredByFirstBlack || isCoveredBySecondBlack || isCoveredByCombinedBlack) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    private static boolean isCovered(int blackX1, int blackY1, int blackX2, int blackY2,
                                     int whiteX1, int whiteY1, int whiteX2, int whiteY2) {
        return (blackX1 <= whiteX1 && blackX2 >= whiteX2 && blackY1 <= whiteY1 && blackY2 >= whiteY2);
    }
}