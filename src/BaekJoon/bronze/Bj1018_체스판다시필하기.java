package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018_체스판다시필하기 {
    public static int[][] arr;
    public static int answer;
    public static int N;
    public static int M;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         answer = 0;
         arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < M; j++) {
                char c = str.charAt(j);
                if(c=='B') arr[i][j] = 1;
                if(c=='W') arr[i][j] = 2;
            }
        }
        recur(0,0);
        System.out.println(answer);
    }

    public static void recur(int startX, int startY) {
        System.out.print("strat! : ");
        System.out.print("startX = " + startX+", ");
        System.out.print("startY = " + startY + ", ");
        System.out.println("X max : " + (startX + 8) + ", Y max : " + (startY + 8));
        if(startX + 8 >= M ){
            if(startY + 8 >= N){
                System.out.println("======end========");
                return;
            }
            recur(0, startY + 1);
        }
        int result =0;
        for (int y = startY; y < startY + 8; y++) {
            int i = 0;
            for (int x = startX; x < startX + 8; x++) {
                int number = arr[y][x];
                System.out.println("y , x : " + y +", " + x);
                if (number == i) {
                    result++;
                    i = 0;
                }else{
                    i = number;
                }
            }
            answer = Math.min(answer, result);
        }
        recur(startX + 1, startY);


    }

}
