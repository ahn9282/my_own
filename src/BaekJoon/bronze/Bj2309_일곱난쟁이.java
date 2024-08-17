package BaekJoon.bronze;

import java.io.*;
import java.util.Arrays;

public class Bj2309_일곱난쟁이 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
                   int a =  Integer.parseInt(br.readLine());
            arr[i] = a;
            sum += a;
        }
        br.close();
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(100 == sum - arr[i]-arr[j]){
                    arr[i] = 0;
                    arr[j] = 0;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
                bw.write(arr[i] + "\n");}

        bw.flush();
        bw.close();
    }
}
