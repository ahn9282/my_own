package Algorithm.tompdown_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BjTemplate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        boolean small = M < 45;
        if(small){
            if(H==0){
                H = 23;
            }else{
                H--;
            }
        }
        sb.append(H);
        sb.append(" ");
        sb.append((small) ? M +15 : M - 45);
        System.out.println(sb.toString());
    }
}
