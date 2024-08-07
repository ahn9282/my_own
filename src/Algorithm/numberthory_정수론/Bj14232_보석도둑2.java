package Algorithm.numberthory_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bj14232_보석도둑2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());

        int c = 2;
        int cnt = 0;
        List<String> list = new ArrayList<>();
        while(k != 1) {
            if (c>=1000000) {
                list.add(k+"");
                cnt++;
                break;
            }
            if (k % c == 0) {
                k/=c;
                cnt++;
                list.add(c+"");
            }
            else {
                c++;
            }
        }
        System.out.println(cnt);
        System.out.println(String.join(" ", list));

    }
}
