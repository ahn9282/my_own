package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_백만장자프로젝트 {
    static long answer;
    static Queue<Long> que;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int iter = 2;
        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {

            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            que = new PriorityQueue<>();
            long[] arr = new long[N];
            answer = 0;

            for (int i = 0; i < N; i++) {
                long value = Long.parseLong(st.nextToken());
                que.add(value);
                arr[i] = value;
            }
            long max = que.poll();
            long count = 0;
            for (int i = 0; i < N; i++) {
                long now = arr[i];
                if(now == max){
                    answer += count * now;
                    if(i == N-1)break;
                    max = que.poll();
                }
                answer -= now;
                count++;
            }
            System.out.println("#" + test + " " + answer);

        }
    }
}
