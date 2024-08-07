package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj12745_진법변환1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str= st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] arr = new int[str.length()];
        for (int i =0; i <str.length() ; i++) {
            int now = str.charAt(str.length()  - 1 - i);
            if(now >=65) {
                now -= 55;
            }else{
                now -= 48;
            }
            answer += (int) Math.pow(num, i) * now;
        }
        System.out.println(answer);

    }
}
