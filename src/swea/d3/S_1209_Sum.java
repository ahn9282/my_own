package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1209_Sum {
    static int answer;
    static int[][] arr;
    static int[] rowSums, colSums;
    static int leftCross, rightCross;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 1; i++) {

            arr = new int[100][100];
            rowSums = new int[100];
            colSums = new int[100];
            leftCross = 0;
            rightCross = 0;

            int test_case = Integer.parseInt(br.readLine());

            for (int y = 0; y < 100; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < 100; x++) {
                    int value = Integer.parseInt(st.nextToken());
                    arr[y][x] = value;
                    rowSums[y] += value;
                    colSums[x] += value;
                    if (x == y) leftCross += value;
                    if ((x + y) == 99) rightCross += value;
                }

            }
            int rowMax = getMaxInArray(rowSums);
            int colMax = getMaxInArray(colSums);
            answer = Math.max(rowMax, Math.max(colMax, Math.max(leftCross, rightCross)));

            System.out.println("#" + test_case + " " + answer);
        }

    }

    static int getMaxInArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
