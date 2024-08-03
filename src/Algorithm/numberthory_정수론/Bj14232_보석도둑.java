package Algorithm.numberthory_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bj14232_보석도둑 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        int now = 2;
        int cnt = 0;
        List<String> list = new ArrayList<>();
        while(num != 1) {
            if (now>=1000000) {
                list.add(num+"");
                cnt++;
                break;
            }
            if (num % now == 0) {
                num/=now;
                cnt++;
                list.add(now+"");
            }
            else {
                now++;
            }
        }
        System.out.println(cnt);
        System.out.println(String.join(" ", list));

    }
}
