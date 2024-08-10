package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj1620_포켓몬마스터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[N+1];
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            map.put(s, i);
            arr[i] = s;
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (str.charAt(0) < 65) {
                System.out.println(arr[Integer.parseInt(str) ]);

            }else{
                System.out.println(map.get(str));
            }
        }
    }
}
