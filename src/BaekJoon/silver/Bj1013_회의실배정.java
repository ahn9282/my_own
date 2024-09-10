package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj1013_회의실배정 {
    static int answer, N;
    static List<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
         arr = new ArrayList[N];
        int answer = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i].add(a);
            arr[i].add(b);
        }
        recur(0, 0, 0);
        System.out.println(answer);
    }
     static void recur(int idx, int count, int before){
            answer = Math.max(answer, count);
        if(idx >= arr.length){
            return;
        }
        recur(idx+1, count, before);
        if(arr[idx].get(0) >= before) {
            recur(idx + 1, count + 1, before);
        }
    }
}
