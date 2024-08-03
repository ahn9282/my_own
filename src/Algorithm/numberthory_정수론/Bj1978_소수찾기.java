package Algorithm.numberthory_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1978_소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int cnt = 0;
        br.close();
        for (String s : arr) {
            int a = Integer.parseInt(s);
            if(a != 1){

            for (int i = 2; i <= Math.round(Math.sqrt(a)); i++) {
                if (a % i == 0) {
                    cnt++;
                    break;
                }
            }
            }else{
                cnt++;
            }
        }
        System.out.println(N - cnt);

    }
}
