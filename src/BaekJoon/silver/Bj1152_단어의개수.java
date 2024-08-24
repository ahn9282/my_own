package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1152_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(s);
        int answer = 0;
        while (st.hasMoreTokens()) {
            answer++;
            st.nextToken();
        }
        System.out.println(answer);
    }
}
