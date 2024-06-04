package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] =  Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n - 1;i++){
        int temp = 0;
            for(int j =0; j <n - i -1; j++){
                if(arr[j] > arr[j+1]){

               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
