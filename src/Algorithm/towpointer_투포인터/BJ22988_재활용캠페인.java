package Algorithm.towpointer_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BJ22988_재활용캠페인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        double plus = K / 2.0;
        int s= 0;
        int e =0;
        long answer = 0;
        for (int i = N-1; i >= 0; i--) {
            if (arr[i] == K) {
                N--;
                answer++;
            } else {
                e = i;
                break;
            }
        }
        while(s<e){
            if(arr[s] + arr[e] >= plus){
                answer++;
                N-=2;
                e--;
                s++;
                continue;
            }
            if(arr[s] + arr[e] < plus)s++;
        }
        answer += N / 3;
        System.out.println(answer);

    }
}
