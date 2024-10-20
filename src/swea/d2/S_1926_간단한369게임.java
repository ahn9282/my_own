package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1926_간단한369게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int now = 1;
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            now = i;
            String str = "";
                while (now != 0) {
                    int one = now % 10;
                    if (one == 3 || one == 6 || one == 9) {
                        str += "-";
                    }
                    now = now / 10;
                }
                if(str.length() !=0){
                    sb.append(str);
                }else{
                    sb.append(i);
                }
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }
}
