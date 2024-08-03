package Algorithm.cumulativesum_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bj2304_창고다각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        column[] arr = new column[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new column(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(arr);
        int focusTop = 0;
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].high > arr[focusTop].high) focusTop = i;
        }
        int idx = 0;
        for (int i = 0; i <= focusTop; i++) {
            if (arr[idx].high <= arr[i].high) {
                result += (arr[i].loc - arr[idx].loc) * arr[idx].high;
                idx = i;
            }
        }
        idx = n - 1;
        for (int i = idx; i >= focusTop; i--) {
            if (arr[idx].high <= arr[i].high) {
                result += (arr[idx].loc - arr[i].loc) * arr[idx].high;
                idx = i;
            }
        }
        result += arr[focusTop].high;
        System.out.println(result);

    }
    public static class column implements Comparable<column> {
        public int loc;
        public int high;

        public column(int location, int high) {
            this.loc = location;
            this.high = high;
        }

        @Override
        public int compareTo(column c) {
            return this.loc - c.loc;
        }

    }
}
