package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Bj19942_다이어트 {
    public static int min = 1000000;
    public static int[][] arr;
    public static int[] cutLine;
    public static int N;
    public static int answer;
    public static int count;
    public static StringBuilder sb;
    public static  int[] indexes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cutLine = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            cutLine[i] = Integer.parseInt(st.nextToken());
        }
        sb = new StringBuilder();
        arr = new int[N][5];
        for (int k = 0; k < N; k++) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 5; i++) {
                arr[k][i] = Integer.parseInt(st.nextToken());
            }
        }
        count = 0;
        int[] ints = new int[0];

        recur(0, 0, 0, 0, 0, 0, count, false, ints);
        if (min == 1000000) {
            System.out.println(-1);
        } else {
            System.out.println(min);
            Arrays.sort(indexes);
            for (int anInt : indexes) {
                System.out.print(anInt + " ");
            }
        }

    }

    public static void recur(int index, int A, int B, int C, int D, int E, int count, boolean add, int[] arrD) {
        int[] array = {};
        if (add) {
            array = new int[arrD.length + 1];
            for (int i = 0; i < arrD.length; i++) {
                array[i] = arrD[i];
            }
            array[arrD.length ] = index;
        } else {
             array = new int[arrD.length];
            for (int i = 0; i < arrD.length; i++) {
                array[i] = arrD[i];
            }
        }
        if (A > cutLine[0] && B >= cutLine[1] && C >= cutLine[2] && D >= cutLine[3]) {
            if (count > 6) return;
            System.out.println("조건 만족 비용 : " + E);
            min = Math.min(min, E);
            if (E == min) {
                indexes = array;
            }
            sb.append(count);
            sb.append(" ");
            return;
        } else {
            if (index == N) return;
        }

        recur(index + 1, A + arr[index][0], B + arr[index][1],
                C + arr[index][2], D + arr[index][3], E + arr[index][4], count + 1, true, array);
        recur(index + 1, A, B, C, D, E, count, false, array);
    }
}
