package Algorithm.tompdown_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj12865_평범한배낭_나만의풀이법 {

    public static int[][] arr;
    public static int N;
    public static int K;
    public static int max = 0;
    public static Map<Integer, Integer> map = new HashMap<>();
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if(! map.containsKey(w)){
                list.add(w);
            }
            if ( ! map.containsKey(w) || map.get(w) < v) {
                map.put(w, v);
            }
        }

        recur(0, 0, 0);
        System.out.println(max);
    }

    public static void recur(int index, int w, int v) {

        if (w > K || index == list.size())   return;
        max = Math.max(max, v);

        recur(index + 1, w + list.get(index), v+map.get(list.get(index)));
        recur(index + 1, w, v);

    }
}
