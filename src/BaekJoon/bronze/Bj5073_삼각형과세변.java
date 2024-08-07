package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5073_삼각형과세변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b == 0 && c== 0) break;
            int ab = (a == b) ? 1 : 0;
            int bc = (c == b) ? 1 : 0;
            int ac = (a == c) ? 1 : 0;
            int abc = ab + bc + ac;
            String str = "";
            if(abc ==3){
                str = "Equilateral";
            }else{
                if(abc == 1){
                    str = "Isosceles";
                }else{
                    str = "Scalene ";
                }
                int max = Math.max(a, b);
                max = Math.max(max, c);
                if (max == a) {
                    str = (a < b + c) ? str : "Invalid";
                } else if (max == b) {
                    str = (b < a + c) ? str: "Invalid";
                }else{
                    str = (c < b + a) ? str : "Invalid";
                }
            }
            System.out.println(str);
        }
    }
}
