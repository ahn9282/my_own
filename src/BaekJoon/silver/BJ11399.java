package BaekJoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int humans = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time[] = new int[humans];

        for (int i = 0; i < humans; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int answer = 0;

        Arrays.sort(time);

        for (int i = 0; i < humans; i++) {
            sum += time[i];
            answer += sum;
        }

        bw.write(String.valueOf(answer));

        bw.close();
        br.close();
    }
}
