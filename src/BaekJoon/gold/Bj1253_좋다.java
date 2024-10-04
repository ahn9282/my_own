package BaekJoon.gold;

import java.io.*;
import java.util.*;

public class Bj1253_좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            while(true){

                if(left == i) left++;
                else if(right == i) right--;

                if(left >= right) break;

                if(arr[left] + arr[right] > arr[i]) right--;
                else if(arr[left] + arr[right] < arr[i]) left++;
                else{
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
