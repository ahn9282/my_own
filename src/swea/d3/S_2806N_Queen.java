package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2806N_Queen {

    static int N, answer;
    static boolean[][] arr;
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {

            answer = 0;
            N = Integer.parseInt(br.readLine());
            board = new int[N];
            answer = 0;

            solve(0);
            System.out.println("총 해결 방법 수: " + answer);

        }
    }

    public static void solve(int row) {
        if (row == N) {
            answer++;
            printBoard();
            return;
        }

        for (int col = 0; col < N; col++) {
            if (canPlace(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }
    public static boolean canPlace(int row, int col) {
        for (int i = 0; i < row; i++) {

            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    public static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
