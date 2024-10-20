package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2007_패턴마디의길이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            char[] charArray = str.toCharArray();
            String word = "";
            for (int j = 0; j < 10; j++) {
                String now = str.substring(0, j + 1);
                String compare = str.substring(j + 1, 2*j + 2);
                if(now.equals(compare)){
                    word = now;

                    break;
                }
            }

            sb.append("#" + i + " ");
            sb.append(word.length()+"\n");
        }
        System.out.println(sb.toString());
    }
}
