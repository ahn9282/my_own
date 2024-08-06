package Algorithm.backtracking.bruteforce;

import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Bj2961_맛있는음식 {
    public static int[][] arr;
    public static int answer = 1000000000;
    public static int n;
    public static int count ;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
         arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
            count = 100000000;
        recur(0, 0, 1,0);
        System.out.println(answer);
    }

    public static void recur(int index, int sugar, int salt, int use) {

        if(index == n){
            if(use == 0) return;
            int result = Math.abs(sugar - salt);
            answer = Math.min(result, answer);
            count = Math.min(count, use);
            System.out.println("result : " + result + ", 총 최소 : " + answer+", 사용 : " + use);
            return;
        }

        recur(index + 1, sugar + arr[index][1], salt * arr[index][0], use+1);
        recur(index + 1, sugar, salt, use);
    }
}
