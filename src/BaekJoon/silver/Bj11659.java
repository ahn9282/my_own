package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj11659 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int no = Integer.parseInt(st.nextToken());
        long[] arr = new long[start + 1];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i <= start ; i++){
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());

        }
        for (int i = 0; i < no; i++) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            System.out.println(arr[k] - arr[k - 1]);
        }

    }
}
