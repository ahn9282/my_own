package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1215_회문1 {
    static int[][] arr;
    static int N, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iter = 10;

        for (int i =0; i < iter; i++) {

            arr = new int[8][8];
            answer = 0;
            N = Integer.parseInt(br.readLine());

            for (int Y = 0; Y < 8; Y++) {

                String str = br.readLine();

                for (int X = 0; X < 8; X++) {
                    int c = str.charAt(X) - 'A';
                    arr[Y][X] = c;
                }
            }
            for (int Y = 0; Y < 8; Y++) {
                for (int X = 0; X < 8; X++) {
                    validWord(Y, X);
                }
            }
            System.out.println("#" + (i + 1) + " " + answer);
        }
    }



    static void validWord(int y, int x) {

        if (x + N <= 8) {
            boolean isPalindrome = true;
            for (int i = 0; i < N / 2; i++) {
                if (arr[y][x + i] != arr[y][x + N - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) answer++;
        }

        if (y + N <= 8) {
            boolean isPalindrome = true;
            for (int i = 0; i < N / 2; i++) {
                if (arr[y + i][x] != arr[y + N - 1 - i][x]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) answer++;
        }
    }
}
