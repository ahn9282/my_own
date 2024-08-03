package Algorithm.bruteforce_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj2503_숫자야구 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer[]> answers = new ArrayList<>();
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = st.nextToken().split("");
            list.add(arr);
            answers.add(new Integer[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        br.close();
        int answer = 0;

        int ball_count = 0;
        int strike_count = 0;
        for (int a = 1; a < 10; a++) {//10
            for (int b = 1; b < 10; b++) {//10
                for (int c = 1; c < 10; c++) {//10  까지 위부터 100의 자리, 10의 자리, 1의 자리
                    if (a != b && b != c && c != a) {

                        int count = 0;
                        for (int i = 0; i < num; i++) {
                            int exStrike = answers.get(i)[0];
                            int exBall = answers.get(i)[1];

                            int ball = 0;
                            int strike = 0;

                            int v1 = Integer.parseInt(list.get(i)[0]);
                            int v2 = Integer.parseInt(list.get(i)[1]);
                            int v3 = Integer.parseInt(list.get(i)[2]);

                            // 현재 반복의 숫자 a, b, c 경우의 조건
                            //v1 - 100의 자리의 경우
                            if(v1 == a){
                                strike++;
                            }else if(v1 == b){
                                ball++;
                            } else if (v1 == c) {
                                ball++;
                            }
                            //v2 - 10의 자리의 경우
                            if(v2 == a){
                                ball++;
                            }else if(v2 == b){
                                strike++;
                            } else if (v2 == c) {
                                ball++;
                            }
                            //v3 - 1의 자리의 경우
                            if(v3 == a){
                                ball++;
                            }else if(v3 == b){
                                ball++;
                            } else if (v3 == c) {
                                strike++;
                            }
                            if (strike == exStrike && ball == exBall) {
                                count++;
                            }
                        }
                        //모든 요청에 해당하여 count가 응답 수와 같은 경우 정답에 해당하는 수
                        if (count == num) {
                            answer++;

                        }

                    }
                }
            }
        }
        System.out.println(answer);

    }
}
