package BaekJoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int[] base = arr.clone();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int tmp=1234567;
        int order = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                tmp = arr[i];
            } else {
                if (arr[i] != tmp) {
                    order++;
                    tmp = arr[i];
                }else{
                    continue;
                }
            }
                    map.put(tmp, order);
        }
        for (int i : base) {
            bw.write(map.get(i)+"\n");
        }

        bw.flush();
        bw.close();
    }
}
