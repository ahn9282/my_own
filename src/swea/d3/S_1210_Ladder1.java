package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S_1210_Ladder1 {
    static int[][] arr;
    static int answer;
    static List<Integer> starts;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int test_case = 1; test_case <= 10; test_case++) {
        int T = Integer.parseInt(br.readLine());

            arr = new int[100][100];
            starts = new ArrayList<>();
            answer = 0;

            for (int y = 0; y < 100; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < 100; x++) {

                    arr[y][x] = Integer.parseInt(st.nextToken());
                    if(y == 0){
                        if(arr[y][x] == 1){
                            starts.add(x);
                        }
                    }
                }
            }
            for (Integer start : starts) {
                if(down( start)){
                    answer = start;
                    break;
                }
            }
            System.out.println("#" + T + " " + answer);
        }
    }

    static boolean down(int col) {
        int row = 0;

        while (row < 99) {
            if (col > 0 && arr[row][col - 1] == 1) {
                while (col > 0 && arr[row][col - 1] == 1) {
                    col--;
                }
            } else if (col < 99 && arr[row][col + 1] == 1) {
                while (col < 99 && arr[row][col + 1] == 1) {
                    col++;
                }
            }
            row++;
        }
        return arr[row][col] == 2;
    }
}
