package swea.d3.S_1244_최대상금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1244_최대상금 {
    static char[] arr, asc;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int count;

        for (int i = 1; i <= N; i++) {

            count = i;
            st = new StringTokenizer(br.readLine());
            String maxNumLen = st.nextToken();
            int maxChange = Integer.parseInt(st.nextToken());

            arr = maxNumLen.toCharArray();
            asc = maxNumLen.toCharArray();
            Arrays.sort(asc);

            change(0, 0, maxChange);

            sb.append("#").append(count).append(" ");
            for (char c : arr) {
                sb.append(c);
            }
            sb.append("\n");
        }

        br.close();
        System.out.println(sb.toString());
    }

    static void change(int idx, int iterate, int limit) {
        if (iterate == limit || idx >= arr.length) return;

        char max = asc[asc.length - 1 - iterate];
        boolean swapped = false;

        if (arr[idx] != max) {
            for (int i = arr.length - 1; i > idx; i--) {
                if (arr[i] == max) {
                    swap(idx, i);
                    swapped = true;
                    break;
                }
            }
        }

        if (!swapped) {
            change(idx + 1, iterate, limit);
        } else {
            change(idx + 1, iterate + 1, limit);
        }
    }
    static void swap(int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
