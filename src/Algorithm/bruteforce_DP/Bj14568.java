package Algorithm.bruteforce_DP;

import java.io.IOException;
import java.util.Scanner;

public class Bj14568 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int num = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i <= num; i++) {
            for (int j= 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    if (i + j + k == num) {
                        if (i >= j + 2) {
                            if (i != 0 && j != 0 && k != 0) {
                                if (k % 2 == 0) {
                                    answer++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
