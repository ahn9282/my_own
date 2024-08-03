package Algorithm.bruteforce_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj2503 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(br.readLine().split(" "));
        }
        br.close();
        int answer = 0;
        int count = 0;
        int ball_count = 0;
        int strike_count = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    if (a == b || b == c || c == a)  continue;
                    for (String[] s : list) {
                        int number = Integer.parseInt(s[0]);
                        int ball = Integer.parseInt(s[1]);
                        int strike = Integer.parseInt(s[2]);

                        if (ball == ball_count && strike_count == strike) {
                            count++;
                        }
                    }
                    if (count == num) {
                        answer += 1;
                    }

                }
            }
        }
        System.out.println(answer);

    }
}
