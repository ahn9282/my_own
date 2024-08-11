package Algorithm.towpointer_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 투포인터 :  가능성을 지워주는 방법
public class Bj3273_두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        int s= 0;
        int e = N-1;
        int getNum = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        while(s < e){
            if(arr[s] + arr[e] == getNum)count++;
            if(arr[s] + arr[e] >= getNum) e--;
            else s++;
            }

        System.out.println(count);
        }
}
