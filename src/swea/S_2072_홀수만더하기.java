package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2072_홀수만더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            sb.append("#" + (i + 1)+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                if(a %2 ==1){
                    sum+=a;
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb.toString());
    }
}
