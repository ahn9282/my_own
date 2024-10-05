package swea.d4;

import java.io.*;
import java.util.StringTokenizer;

public class S_21426흰종이와검은종이 {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
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

            int maxX = Math.max(whiteX2, Math.max(blackX2, blackX4));
            int maxY = Math.max(whiteY2, Math.max(blackY2, blackY4));

            int[][] board = new int[maxY + 1][maxX + 1];


            for (int y = whiteY1; y < whiteY2; y++) {
                for (int x = whiteX1; x < whiteX2; x++) {
                    board[y][x] = 1;
                }
            }

            for (int y = blackY1; y < blackY2; y++) {
                for (int x = blackX1; x < blackX2; x++) {
                    board[y][x] = 2;
                }
            }

            for (int y = blackY3; y < blackY4; y++) {
                for (int x = blackX3; x < blackX4; x++) {
                    board[y][x] = 2;
                }
            }
            boolean isWhiteLeft = false;
            for (int y = whiteY1; y < whiteY2; y++) {
                for (int x = whiteX1; x < whiteX2; x++) {
                    if (y >= 0 && y < board.length && x >= 0 && x < board[0].length) {
                        if (board[y][x] == 1) {
                            isWhiteLeft = true;
                            break;
                        }
                    }
                }
                if (isWhiteLeft) break;
            }

            if (isWhiteLeft) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
