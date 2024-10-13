package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1213__String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iter = 2;

        for (int i = 1; i <= iter; i++) {
            int N = Integer.parseInt(br.readLine());
            String keyWord = br.readLine();
            String str = br.readLine();
            int answer = 0;
            int length = keyWord.length();
            char firstKeyWord = keyWord.charAt(0);
            if(length == 1) length = 0;

            for (int j = 0; j <= str.length() - length; j++) {
                char firstStr = str.charAt(j);
                if (firstStr == firstKeyWord) {
                    String compareStr = str.substring(j, j+length );
                    System.out.println("compareStr = " + compareStr);
                    if (compareStr.equals(keyWord)) answer++;
                }
            }
            System.out.println("#" + N + " " + answer);
        }
    }
}
