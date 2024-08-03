package Algorithm.numberthory_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Bj14252_공약수열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 1; i < list.size(); i++) {
            int now = list.get(i);
            int before = list.get(i - 1);
            if (GCD(now, list.get(i - 1)) != 1) {
                int check = 0;
                for (int j = before + 1; j < now; j++) {
                    if (GCD(j, now) == 1 && GCD(j, before) == 1) {
                        check++;
                        break;
                    }
                }
                if (check == 0) {
                    for (int j = 1; j < now - before; j++) {
                        int comBefore = before + j;
                        int comeNow = now - j;
                        if ((GCD(comeNow, now) == 1) && (GCD(comBefore, before) == 1) && GCD(comBefore, comeNow) == 1) {
                            check +=2;
                            break;
                        }
                    }
                }
                count += check;
            }
        }
        System.out.println(count);

    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

}
