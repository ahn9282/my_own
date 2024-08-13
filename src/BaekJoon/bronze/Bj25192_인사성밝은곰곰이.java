package BaekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bj25192_인사성밝은곰곰이 {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer =0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER"))
            {
                answer += set.size();
                set.clear();
                continue;
            }
            set.add(str);
            if(i == N-1)answer += set.size();
        }
        System.out.println(answer);

    }
}
