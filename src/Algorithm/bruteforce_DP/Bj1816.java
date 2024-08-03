package Algorithm.bruteforce_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
                long value = Long.parseLong(br.readLine());
                for (int j = 2; j <= 1000000; j++) {
                    if(value % j ==0){
                        System.out.println("NO");
                        break;
                    }
                    if (j == 1000000) {
                        System.out.println("YES");
                    }
                }

        }
        br.close();
    }
}
